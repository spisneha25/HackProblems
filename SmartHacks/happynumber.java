/*
e.g. 19 is a Happy Number

    1^2 + 9^2 = 82
    8^2 + 2^2 = 68
    6^2 + 8^2 = 100
    1^2 + 0^2 + 0^2 = 1

*/

If infinite loop, then eventually one number should be repeated. That is the stop condition. 
*/
public class Solution 
{
    HashSet<Integer> hs = new HashSet<Integer>();
    
    public boolean isHappy(int n) 
    {
        int sum = 0;
        
        while(n >= 1)
        {
            int d = n % 10;
            sum += d*d;
            n /= 10;
        }
        
        if(sum == 1)
            return true;
        else if(hs.contains(sum))
            return false;
        
        hs.add(sum);
        
        return isHappy(sum);
    }
}
