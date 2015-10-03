public class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        return productHelper2(nums);
    }
    
    private int[] productHelper2(int[] nums)
    {
        int mul = 1;
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        
        for(int i = 0; i < n; i++ )
        {
            ans[i] = mul;
            mul *= nums[i]; 
        }
        
        mul = 1;
        for(int i = n - 1; i >= 0; i-- )
        {
            ans[i] *= mul;
            mul *= nums[i]; 
        }
        
        return ans;
    }
    
    private int[] productHelper1(int[] nums)
    {
        int n = nums.length;
        int ans[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = 1;
        right[n - 1] = 1;
        
        for(int i = 1; i < n; i++)
            left[i] = nums[i - 1] * left[i - 1];
        
        for(int i = n - 2; i >= 0; i--)
            right[i] = nums[i + 1] * right[i + 1];
            
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
}
