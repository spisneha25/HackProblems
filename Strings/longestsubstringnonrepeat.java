/*
Longest substring with non repeating characters

abcabcd : 4
bbbbbbb : 1
aabbaab : 2

*/


public class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        return lengthOfLongestSubstring1(s);
        //return lengthOfLongestSubstring2(s);
    }
    
    //O(n)
    public int lengthOfLongestSubstring1(String s) 
    {
        if(s == null || s.length() ==  0)
            return 0;
            
        int[] visited = new int[256];
        int clen = 1, glen = 1, pv;
        
        for(int i = 0; i < visited.length; i++)
            visited[i] = -1;
        
        visited[s.charAt(0)] = 0;
        
        for(int i = 1; i < s.length(); i++)
        {
            pv = visited[s.charAt(i)];
            
            if(pv == -1 || i - clen > pv)
                clen++;
                
            else
            {
                glen = Math.max(clen, glen);
                clen = i - pv;
            }
            
            visited[s.charAt(i)] = i;
        }
        
        glen = Math.max(clen, glen);
        
        return glen;
    }
    
    //O(n2)
    public int lengthOfLongestSubstring2(String s) 
    {
        if(s == null || s.length() ==  0)
            return 0;
            
        int glen = 1;
        int len = 0;
        boolean[] map = new boolean[256];
        
        for(int i = 0; i < s.length(); i++)
        {
            int j = i;
            len = 0;
     
            while(j < s.length())
            {
                if(map[s.charAt(j)])
                {
                    map = new boolean[256];
                    break;
                }
                else
                {
                    map[s.charAt(j)] = true;
                    len++;
                    j++;
                }
            }
            glen = Math.max(len, glen);
        }
        
        return glen;
    }
}
