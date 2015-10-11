public class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        
        List<List<Integer>> sl = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < nums.length; i++)
        {
            //Skip Duplicates
            if (i == 0 || nums[i] > nums[i - 1]) 
            {
                int l = i + 1;
                int h = nums.length - 1;

                while(l < h)
                {
                    if(nums[i] + nums[l] + nums[h] == 0)
                    {
                        List<Integer> al = new ArrayList<Integer>();
                        al.add(nums[i]);
                        al.add(nums[l]);
                        al.add(nums[h]);
                        sl.add(al);
                        l++;
                        h--;
                        
                        //Skip Duplicates
                        while(l < h && nums[l] == nums[l - 1])
                            l++;
                        
                        while(l < h && nums[h] == nums[h + 1])
                            h--;
                        
                    }
                    else if(nums[i] + nums[l] + nums[h] < 0)
                        l++;
                    else
                        h--;
                }
            }
        }
        
        return sl;
    }
}
