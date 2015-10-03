public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int lo = 0, hi = nums.length - 1;
        
        k = nums.length - k;
        
        while(lo < hi)
        {
            int p = partition(nums, lo, hi);
            
            if(p < k)
                lo = p + 1;
            else if ( p > k)
                hi = p - 1;
            else
                return nums[p];
                
        }
        
        return nums[lo];
    }
    
    public int partition(int[] a, int lo, int hi)
    {
        int p = lo;
        int l = lo + 1, h = hi;
        
        while(true)
        {
            while(l < hi && a[l] <= a[p])
                l++;
            while(h > lo && a[h] > a[p])
                h--;
            if(l < h)
            {
               exch(a, l, h);
            }
            else
                break;
        }
        
        exch(a, p, h);
        
        return h;
    }
    
    private void exch(int[] a, int i, int j)
    {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
    }
}
