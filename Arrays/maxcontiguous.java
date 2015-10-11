public class Solution {
    public int maxSubArray(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return 0;
        
        int max = nums[0], cur_max = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            cur_max = Math.max(cur_max + nums[i], nums[i]);
            max = Math.max(max, cur_max);
        }
        
        return max;
    }
}
