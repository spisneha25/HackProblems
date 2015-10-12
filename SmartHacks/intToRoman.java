public class Solution
{
    public String intToRoman(int num) 
    {
        int[] rn = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sn = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer sb = new StringBuffer();
        
        if(num < 1)
            return "";
            
        for(int i = 0; i < rn.length; i++)
        {
            int d = num/rn[i];
            while(d > 0)
            {
                sb.append(sn[i]);        
                d--;
            }
            num = num % rn[i];
        }
        
        return sb.toString();
    }
}
