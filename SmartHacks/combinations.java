public class Solution 
{
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        if(n == 0 || n < k)
            return ll;
            
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        combineHelper(n, k, 1, ll ,al);
        
        return ll;
    }
    
    private void combineHelper(int n, int k, int start, List<List<Integer>> ll, ArrayList<Integer> al)
    {
        if(al.size() == k)
        {
            ll.add((List) al.clone());
            return;
        }
        
        for(int i = start; i <= n; i++)
        {
            al.add(i);
            combineHelper(n, k, i + 1, ll, al);
            al.remove(al.size() - 1);
        }
    }
  }
