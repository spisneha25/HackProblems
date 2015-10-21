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
    private static class Node
	{
	    TreeNode node;
	    int level;
	    
	    public Node(TreeNode n, int l)
	    {
	        node = n;
	        level = l;
	    }
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();

        if(root == null)
            return ll;

        Queue<Node> q = new LinkedList<Node>();
        
        zigzagHelper(root, q, ll);
        
        return ll;
    }
    
    private void zigzagHelper(TreeNode root,  Queue<Node> q, List<List<Integer>> ll)
    {
        Stack<TreeNode> currLevel = new Stack<TreeNode>();
        Stack<TreeNode> nextLevel = new Stack<TreeNode>();
        Stack<TreeNode> tmp;
        
        currLevel.push(root);
        boolean normalOrder = true;

        while (!currLevel.isEmpty()) 
        {
            List<Integer> currLevelResult = new ArrayList<Integer>();

            while (!currLevel.isEmpty()) 
            {
                TreeNode node = currLevel.pop();
                currLevelResult.add(node.val);

                if (normalOrder) 
                {
                    if (node.left != null) 
                    {
                        nextLevel.push(node.left);
                    }
                    if (node.right != null) 
                    {
                        nextLevel.push(node.right);
                    }
                } 
                else 
                {
                    if (node.right != null)
                    {
                        nextLevel.push(node.right);
                    }
                    if (node.left != null) 
                    {
                        nextLevel.push(node.left);
                    }
                }
            }

            ll.add(currLevelResult);
            tmp = currLevel;
            currLevel = nextLevel;
            nextLevel = tmp;
            normalOrder = !normalOrder;
        }
    }
}
