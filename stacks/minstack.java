class MinStack 
{
    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) 
    {
        if(min.isEmpty() || x <= min.peek())
        {
            min.push(x);
        }
        st.push(x);
    }

    public void pop() 
    {
        if(!st.isEmpty())
        {
            int x = st.pop();       
            
            if(!min.isEmpty() && x == min.peek())
                min.pop();
        }
    }

    public int top() 
    {
        return st.peek();   
    }

    public int getMin() 
    {
        if(min.isEmpty())
            return Integer.MAX_VALUE;
        
        return min.peek();
    }
}
