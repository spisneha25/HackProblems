public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        List<List<String>> res = new  ArrayList<List<String>>();
        Arrays.sort(strs);
        for(String s: strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String t = String.valueOf(c);
            
            if(!hm.containsKey(t))
            {
                List<String> l = new ArrayList<String>();
                
                hm.put(t, l);
            }
            
            hm.get(t).add(s);
        }
        
        for(String s : hm.keySet())
        {
            List<String> l = hm.get(s);
           
            res.add(l);    
        }
        
        return res;
    }
}
