public class Solution {
    public int titleToNumber(String s) 
    {
        int l = s.length();
        int ans = 0;
        for(int i = 0; i < l; i++)
        {
            ans += Math.pow(26, l-i-1)*(s.charAt(i) - 'A' + 1);
        }
        return ans;
    }
    
    public String convertToTitle(int n) 
    {
        String bf = new String();
        
        while(n > 0)
        {
            int d = n % 26;
            
            if(d == 0)
            {
                bf = "Z" + bf;
                n = n / 26 - 1; 
            }
                
            else
            {
                bf = (char)('A' + --d) + bf;
                n = n / 26;
            }
        }
        
        return bf;
    }
}
