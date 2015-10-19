public class Solution {
    public int reverse(int x) 
    {
        boolean neg=false;
        
        if(x < 0)
            neg = true;
            
        int t = x > 0 ? x : -x;
        long r = 0;
        while(t > 0)
        {
            r = r*10 + t%10;
            t /= 10;
        }
        
        if(r > Integer.MAX_VALUE)
            return 0;
            
        if(neg)
            r = -r;
            
        return (int) r;
    }
}
