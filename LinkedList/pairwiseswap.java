/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
            
        ListNode prev = null, temp = head;
        while(temp != null && temp.next != null)
        {
            ListNode next = temp.next;

            temp.next = next.next;
            next.next = temp;
            
            if(prev != null)
            {
                prev.next = next;
            }
            else
                head = next;
            
            prev = temp;
            temp = temp.next;
        }
        
        return head;
    }
}
