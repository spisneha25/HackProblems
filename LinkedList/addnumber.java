public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        return addHelper(l1, l2, 0);
    }
    
    private ListNode addHelper(ListNode l1, ListNode l2, int carry)
    {
        int sum = carry;
        ListNode res = null;               
        
        if(l1 == null && l2 == null)
        {
            if(sum != 0)
            {
                 res = new ListNode(sum);
                 res.next = null;
            }
                
            return res;
        }
        
        else if(l1 == null)
        {
            sum += l2.val; 
        }
        
        else if(l2 == null)
        {
            sum += l1.val;
        }
        
        else
        {
            sum += l1.val + l2.val;
        }
        
        res = new ListNode(sum % 10);
        
        res.next = addHelper(l1 == null? null : l1.next, l2 == null? null : l2.next, sum/10);
        
        return res;
    }
}
