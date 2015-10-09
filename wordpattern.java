public class Solution {
    public boolean wordPattern(String pattern, String str) 
    {
        HashMap<Character, String> hm = new HashMap<Character, String>();
        
         String[] cur = str.split(" ");
        
        if(cur.length != pattern.length())
            return false;

        for(int i = 0; i < pattern.length(); i++)
        {
            char p = pattern.charAt(i);
            if(hm.containsKey(p))
            {
                if(!cur[i].equals(hm.get(p)))
                    return false;
            }
            else
            {
                if(hm.containsValue(cur[i]))
                    return false;
                hm.put(p, cur[i]);
            }
        }
        
        return true;
    }
}
