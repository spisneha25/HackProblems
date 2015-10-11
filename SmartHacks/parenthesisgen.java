ublic class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> ll = new ArrayList<String>();
        List<Character> al = new ArrayList<Character>();
        parenthesisHelper(ll, al, n, 0, 0);
        
        return ll;
    }
    
    private void parenthesisHelper(List<String> ll, List<Character> al, int n, int o, int c)
    {
        if(o == n && c == n)
        {
            StringBuffer sb = new StringBuffer();
            for(char p: al)
            {
                sb.append(p);
            }
                
            ll.add(sb.toString());
            
            return;
        }
        
        if(o < n)
        {
            al.add('(');
            parenthesisHelper(ll, new ArrayList(al), n, o + 1, c);
            al.remove(al.size() - 1);
        }
        if(c < o)
        {
            al.add(')');
            parenthesisHelper(ll, new ArrayList(al), n, o, c + 1);
            al.remove(al.size() - 1);
        }
    }
}
