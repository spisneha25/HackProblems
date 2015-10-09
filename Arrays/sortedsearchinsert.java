public class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        if(nums == null && nums.length == 0)
            return -1;
        
        int m, lo = 0, hi = nums.length - 1;
        
        while(lo <= hi)
        {
            m = (hi - lo)/2 + lo;
            if(nums[m] == target)
                return m;
                
            else if(nums[m] < target)
                lo = m + 1;
            
            else
                hi = m - 1;
        }
        
        return lo;
    }
}
