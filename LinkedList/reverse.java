 */
public class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        //return revHelper1(head);
        return revHelper2(head);
    }
    
    private ListNode revHelper1(ListNode head)
    {
        ListNode a = head, b = null, c = null;
        
        while(a != null)
        {
            c = b; 
            b = a;
            a = a.next;
            b.next = c;
        }
        
        head = b;
        
        return head;
    }
    
    private ListNode revHelper2(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
            
        ListNode prev = head.next;
        
        head.next = null;
        
        ListNode rest = revHelper2(prev);
        
        prev.next = head;
        
        return rest;
    }
}
