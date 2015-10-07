/*
Maximize sum of array; Adjacent elements can't be present
*/
public class Solution {
    public int rob(int[] nums) 
    {
       //return robHelper1(nums);
       return robHelper2(nums);
    }
    
    private int robHelper1(int[] nums)
    {
        int max_e = 0, max_o = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i%2 == 0)
            {
                max_e += nums[i];
                max_e = max_e > max_o ? max_e : max_o;
            }   
            else
            {
                max_o += nums[i];
                max_o = max_e > max_o ? max_e : max_o;
            }
                
        }
        
        return max_e > max_o ? max_e : max_o;
    }

    private int robHelper2(int[] nums)
    {
        int n = nums.length;
        int[] dp = new int[n + 1];
        
        dp[0] = 0;
        dp[1] = nums[0];
        
        for(int i = 2; i <= n; i++)
        {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        
        return dp[n];
    }
}
