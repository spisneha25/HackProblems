public class Solution {
    public boolean isAnagram(String s, String t)
    {
        int[] map = new int[256];
        
        int s_u = 0, s_t = 0, l_s = s.length(), l_t = t.length(); 
        
        
        if(l_s != l_t)
            return false;
        else if(l_s == 0 && l_t == 0)
            return true;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(map[s.charAt(i)] == 0)
                s_u++;
            map[s.charAt(i)]++;
        }
        
        for(int j = 0; j < t.length(); j++)
        {
            if(map[t.charAt(j)] == 0)
                return false;
            map[t.charAt(j)]--;
            if(map[t.charAt(j)] == 0)
            {
                s_t++;
                if(s_u == s_t)
                    return true;
                else if(s_u != s_t && j == s.length() - 1)
                    return false;
            }
        }
        
        return false;
        
    }
}
