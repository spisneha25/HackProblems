public class Solution {
    public RandomListNode copyRandomList(RandomListNode head)
    {
        HashMap<RandomListNode, RandomListNode> rm = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode rh = null, th = null, t = head;
        while(t != null)
        {
            RandomListNode newn = new RandomListNode(t.label);
            newn.random = t.random;
            
            System.out.println(t.label);
            
            if(rh == null)
            {
                rh = newn;
                th = newn;
            }
            else
            {
                th.next = newn;
                th = th.next;
            }
            
            rm.put(t, newn);
            t = t.next;
        }
        
        
        th = rh;
        
        while(th != null)
        {
            th.random = rm.get(th.random);
            th = th.next;
        }
        
        return rh;

    }
}


/* 
Space Efficient
    public RandomListNode copyRandomList(RandomListNode head) {  
        if(head == null) return null;  
          
        RandomListNode i = head, n, t;  
          
        while (i != null) {  
            n = i.next;  
            RandomListNode copy = new RandomListNode(i.label);  
              
            i.next = copy;  
            copy.next = n;  
            i = n;  
        }  
      
        //now assign random pointers  
        i = head;   
        while(i!=null){  
            if(i.random!=null)  
                i.next.random = i.random.next;  
            i = i.next.next;  
        }  
          
        //now recover the original structure  
        i = head; n = i.next;  
        RandomListNode foo = n;  
        while(i!=null){  
            i.next = n.next;  
            i = i.next;  
            n.next = i==null?null:i.next;  
            n = n.next;  
        }  
        return foo;  
    } 
*/
