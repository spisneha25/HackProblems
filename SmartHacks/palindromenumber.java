public class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int r = 0;
        int t = x;
        while(t > 0)
        {
            r = r*10 + t%10;
            t /= 10;
        }
        
        if(x == r)
            return true;
            
        return false;
    }
}
