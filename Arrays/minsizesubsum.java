/*
([2,3,1,2,4,3], 7)  = 2
([100,1,2,3,4], 100) = 1
([100,1,99,3,4], 100) = 1
*/

public class Solution 
{
    public int minSubArrayLen(int s, int[] nums) 
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
    
        int left = 0, right = 0, sum = 0, len = nums.length, res = len + 1;
        while (right < len) 
        {
            while (sum < s && right < len) 
            {
                sum += nums[right++];
            }
            while (sum >= s) 
            {
                res = Math.min(res, right - left);
                sum -= nums[left++];
            }
        }
        return res == len + 1 ? 0 : res;
    }

}
