public class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        ArrayList<List<Integer>> ll = new ArrayList<List<Integer>>();
        
        if(nums == null || nums.length == 0)
            return ll;
            
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        
        permuteHelper(nums, 0, al, ll, used);
        
        return (List) ll;
        
    }
    
    private void permuteHelper(int[] nums, int p, ArrayList<Integer> al, ArrayList<List<Integer>> ll, boolean[] used)
    {
        if(p == nums.length)
        {
            ll.add(ll.size(), (List) al.clone());
            
            return;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if(used[i])
                continue;
            al.add(p, nums[i]);
            used[i] = true;
            permuteHelper(nums, p + 1, al, ll, used);
            used[i] = false;
            al.remove(al.size() - 1);
        }
    }
}
