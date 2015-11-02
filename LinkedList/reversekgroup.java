/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
  [1,2,3,4,5], 3 = 3,2,1,4,5
  [1,2,3,4,5,6], 3 = 3,2,1,6,5,4
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head == null)
            return null;
        
        return reverse(head, k);
    }
    
    private ListNode reverse(ListNode head, int k)
    {
        if(head == null)
            return head;
        
        ListNode a = head, b = null, c = null;
        int ct = 0;
        
        while(a != null && ct < k)
        {
            ct++;
            a = a.next;
        }
        
        if(ct == k)
        {
            ct = 0;
            a = head;
            while(a != null && ct < k)
            {
                c = b; 
                b = a;
                a = a.next;
                b.next = c;
                ct++;
            }
         
            head.next = reverse(a, k);
            head = b;
        }    

        return head;    
    }
}
