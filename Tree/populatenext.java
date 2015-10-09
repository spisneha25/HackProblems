/**
1->null
2->3->null
4->5->6->7->null

 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) 
    {
        if(root != null)
        {
            root.next = null;
            connectHelper(root);    
        }
    }
    
    public void connectHelper(TreeLinkNode root)
    {
        if(root.left != null && root.right != null)
        {
            root.left.next = root.right;
            
            if(root.next != null)
            {
                root.right.next = root.next.left;
            }
            else
                root.right.next = null;
            
            connectHelper(root.left);
            connectHelper(root.right);
        }
    }
}
