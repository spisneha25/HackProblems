public class Solution {
    public int findPeakElement(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return -1;
        
        if(nums.length == 1)
            return 0;

        return peakHelper2(nums);    
    }
    
    private int peakHelper1(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0 )
            {
                if(nums[i] > nums[i + 1])
                {
                    return i;
                }
            }
            else if(i == nums.length - 1)
            {
                if(nums[i] > nums[i - 1])
                    return i;
            }
            else 
            {
                if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                {
                    return i;
                }
            }
        }
        
        return 0;
    }
    
    private int peakHelper2(int[] nums)
    {
        int l = 0; 
        int h = nums.length - 1;
        
        while(l < h)
        {
            int m = ( l + h ) / 2;
            
            if((m == l && nums[m] > nums[m + 1]) || (m == h && nums[m] > nums[m - 1]))
                return m;
                
            else if(m == l && m + 1 == h)
            {
                return m+1;
            }
            
            else if(nums[m] > nums[m - 1] && nums[m] > nums[m + 1])
                return m;
                
            else if(nums[m] < nums[m - 1])
                h = m - 1;
            
            else
                l = m + 1;
        }
        
        return l;
    }
}
