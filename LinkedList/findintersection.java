public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        return intersectionHelper2(headA, headB);
    }
    
    private ListNode intersectionHelper1(ListNode ha, ListNode hb)
    {
        HashMap<ListNode, Boolean> hm = new HashMap<ListNode, Boolean>();
        ListNode ta = ha, tb = hb;
        while(ta != null)
        {
            hm.put(ta, true);
            ta = ta.next;
        }
        
        while(tb != null)
        {
            if(hm.containsKey(tb))
                return tb;
            tb = tb.next;
        }
        
        return null;
    }
    
    private ListNode intersectionHelper2(ListNode headA, ListNode headB)
    {
        int na = length(headA), nb = length(headB);
        
        ListNode ta, tb;
        
        if(na < nb)
        {
            ta = headB;
            tb = headA;
        }
        else
        {
            ta = headA;
            tb = headB;
        }
        
        
        for(int i = 0; i < Math.abs(na - nb); i++)
        {
            ta = ta.next;
        }
        
        while(ta != null && tb != null)
        {
            if(ta == tb)
                return ta;
            ta = ta.next;
            tb = tb.next;
        }
        
        return null;
    }
    
    private int length(ListNode head)
    {
        int len = 0;
        ListNode temp = head;
        
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        
        return len;
    }
}
