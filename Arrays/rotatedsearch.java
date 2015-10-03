/*
Only one half is unsorted when array is rotated, the other must be still in sorted order. 
*/


public class Solution {
    public int search(int[] nums, int target) 
    {
        int lo = 0;
        int hi = nums.length - 1;
    
        while(lo <= hi)
        {
            int mi = lo + (hi - lo) / 2;
            
            if(nums[mi] == target)
                return mi;
            else if(nums[mi] <= nums[hi])
            {
                if(target > nums[mi] && target <= nums[hi])
                    lo = mi + 1;
                else
                    hi = mi - 1;
            }
            else
            {
                if(target < nums[mi] && target >= nums[lo])
                    hi = mi - 1;
                else
                    lo = mi + 1;
            }
            
        }
        
        return -1;
    }
}
