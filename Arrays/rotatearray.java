public class Solution {
    public void rotate(int[] nums, int k)
    {
        if(k < nums.length - 1)
        {
            rotateHelper1(nums, k);
            //rotateHelper2(nums, k);
        }
    }
    
    //Time: O(n) Space: O(1) solution
    private void rotateHelper2(int nums[], int s)
    {
        int n = nums.length;
        int i, j, k;
        int temp, gcd = gcd(n, s);
        
        for(i = 0; i < gcd; i++)
        {
            temp = nums[i];
            j = i;
            while(true)
            {
                k = (j - s);
                
                if(k < 0)
                    k = k + n;
                    
                if(k == i)
                    break;
            
                nums[j] = nums[k];
                
                j = k;
            }
            nums[j] = temp;
        }
    }
    
    //More time efficient
    //Time: O(n) Space: O(n) solution
    private void rotateHelper1(int nums[], int k)
    {
        int n = nums.length;
        int[] ans = new int[n];
        
        for(int d = 0; d < n; d++)
        {
            ans[(d+k) % n] = nums[d];
        }
        
        for(int i = 0; i < n; i++)
            nums[i] = ans[i];
    }
    
    private int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        
        return gcd(b, a%b);
    }
}
