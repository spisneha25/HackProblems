public class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        List<Integer> pv = new ArrayList<Integer>();
        
        if(numRows == 0)
            return ll;
            
        if(numRows >= 1)
        {
            al.add(1);
            ll.add(al);
        }
        
        if(numRows >= 2)
        {
            al = new ArrayList<Integer>();
            al.add(1);
            al.add(1);
            ll.add(al);
        }
        
        for(int i = 2; i < numRows; i++)
        {
            al = new ArrayList<Integer>();
            pv = ll.get(i - 1);
            
            al.add(1);
            for(int j = 1; j < pv.size(); j++)
            {
                al.add(pv.get(j) + pv.get(j-1));    
            }
            al.add(1);
            
            ll.add(al);
        }
        
        return ll;
    }
}
