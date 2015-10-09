/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution 
{
    public int sumNumbers(TreeNode root) 
    {
        int sum = 0;
        
        if(root == null)
            return sum;
        
        sum = sumToLeafPaths(root, 0);
        
        return sum;
    }
    
    private int sumToLeafPaths(TreeNode root, int sum)
    {
        if(root == null)
            return 0;
            
        sum = 10*sum + root.val;
        
        if(root.left == null && root.right == null)
        {
            return sum;
        }
        
        return sumToLeafPaths(root.left, sum) + sumToLeafPaths(root.right, sum);
    }
}
