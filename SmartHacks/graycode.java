public class Solution 
{
    public List<Integer> grayCode(int n) 
    {
        int c = 0;
        
        List<Integer> ll = new ArrayList<Integer>();
        ll.add(0);
    
        for(int i = 0; i < n; i++)
        {
            int inc = 1 << i;
            
            for(int j = ll.size() - 1; j >= 0; j--)
            {
                ll.add(ll.get(j) + inc);
            }
        }
        
        return ll;
    }
}
