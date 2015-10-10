public class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        
        if(nums == null || nums.length == 0)
            return ll;
        
        Arrays.sort(nums);            
        
        subsetHelper1(nums, ll);
        
        return ll;
    }

    //Bit Operations
    private void subsetHelper1(int[] nums, List<List<Integer>> ll)
    {
        List<Integer> al;
        for(int i = 0; i < Math.pow(2, nums.length); i++)
        {
            al = new ArrayList<Integer>();
            for(int j = 0; j < nums.length; j++)
            {
                if(((1 << j) & i) != 0)
                    al.add(nums[j]);
            }
            ll.add(al);
        }
    }
}
