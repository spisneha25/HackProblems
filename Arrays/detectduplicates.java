public class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        return duplicateHelper2(nums);    
    }
    
    //Time: O(n) Space: O(n)
    public boolean duplicateHelper1(int[] nums)
    {
        boolean dup;
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
                return true;
            hm.put(nums[i], true);
        }
        
        return false;
    }
    
    //Time: O(nlogn) Space: O(1)
    public boolean duplicateHelper2(int[] nums)
    {
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] == nums[i])
                return true;
        }
        
        return false;
    }
}
