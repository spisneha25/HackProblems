public class Solution {
    public int titleToNumber(String s) 
    {
        int l = s.length();
        int ans = 0;
        for(int i = 0; i < l; i++)
        {
            ans += Math.pow(26, l-i-1)*(s.charAt(i) - 'A' + 1);
            //System.out.println(ans);
        }
        return ans;
    }
}
