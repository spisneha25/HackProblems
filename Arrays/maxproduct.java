public class Solution {
    public int maxProduct(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return 0;
            
        int global = nums[0], localmin  = nums[0], localmax = nums[0];
        
        for(int i =1; i < nums.length; i++)
        {
            int temp = localmax;
            localmax = Math.max(Math.max(localmax*nums[i], nums[i]), localmin*nums[i]);
            localmin = Math.min(Math.min(temp*nums[i], nums[i]), localmin*nums[i]);
            global = Math.max(localmax, global);
        }
        
        return global;
    }
}
