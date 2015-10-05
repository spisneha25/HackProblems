public class Solution 
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
        int cnt = 0;
        int mask = 1;
        
        while(mask != 0)
        {
            if((n & mask) != 0)
                cnt++;
            mask = mask << 1;
        }
        
        return cnt;
    }
}
