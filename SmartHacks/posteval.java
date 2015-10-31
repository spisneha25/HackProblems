public class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<String> st = new Stack<String>();    
        Stack<String> op = new Stack<String>();
        
        HashSet<String> hs = new HashSet<String>();
        hs.add("+");
        hs.add("-");
        hs.add("*");
        hs.add("/");
        
        for(int i = 0; i < tokens.length; i++)
        {
            if(hs.contains(tokens[i]))
            {
                String s2 = st.pop();
                String s1 = st.pop();
                st.push("" + operate(s1, s2, tokens[i]));
                System.out.println(st.peek());
            }
            else
                st.push(tokens[i]);
        }
        
        return Integer.parseInt(st.pop());
    }
    
    public int operate(String s1, String s2, String o)
    {

        if(o.equals("+"))
        {
            //System.out.println(o);
            return Integer.parseInt(s1) + Integer.parseInt(s2);
        }
            
        else if(o.equals("-"))
            return Integer.parseInt(s1) - Integer.parseInt(s2);
            
        else if(o.equals("*"))
            return Integer.parseInt(s1) * Integer.parseInt(s2);
        
        else if(o.equals("/"))
            return Integer.parseInt(s1) / Integer.parseInt(s2);
            
        else
            return 0;
    }
}
