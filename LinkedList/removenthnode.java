/*
[1,2,3,4] 3
[1,3,4]

[1,2,3,4] 1
[1,2,3]
*/

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode prev = head, cur = head, temp = head;
        int i = 0;
        for(i = 0; i < n - 1; i++)
        {
            temp = temp.next;
        }
        
        //System.out.println(temp.val);
        
        while(temp.next != null)
        {
            temp = temp.next;
            prev = cur;
            cur = cur.next;
        }
        
        if(cur == head)
            head = head.next;
        
        prev.next = cur.next;
        
        return head;
    }
}
