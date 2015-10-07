class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    public void push(int x) 
    {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() 
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
                s2.push(s1.pop());
        }
        
        if(!s2.isEmpty())
            s2.pop();
    }

    // Get the front element.
    public int peek() 
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
                s2.push(s1.pop());
        }
        
        if(!s2.isEmpty())
            return s2.peek();   
        
        return -1;
        
    }

    // Return whether the queue is empty.
    public boolean empty() 
    {
       if(s2.isEmpty() && s1.isEmpty())
            return true;
        return false;
    }
}
