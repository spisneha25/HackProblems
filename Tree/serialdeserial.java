/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.StringTokenizer;

public class Codec 
{
       // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
    	String result = null;
    	  	
        if(root == null)
            return "null ";
              
        result = root.val + " ";
        
        if(root.left != null)
        {
            result += serialize(root.left);
        }
        else
            result += "null ";
            
        if(root.right != null)
        {
            result += serialize(root.right);
        }
        else
            result += "null ";
        
        return result;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
    	StringTokenizer st = new StringTokenizer(data, " ");
       
        return deserializeHelper(st);
    }
    
    private TreeNode deserializeHelper(StringTokenizer st)
    {
        if (!st.hasMoreTokens())
    	       return null;
    	
        String val = st.nextToken();
    	    
    	TreeNode newn = create(val);
    	
    	if(newn != null)
    	{
    		newn.left = deserializeHelper(st);
    		newn.right = deserializeHelper(st);
    	}
    	
    	return newn;
    }
    
    private TreeNode create(String d)
    {
        if(d.equals("null"))
            return null;
            
        else
            return new TreeNode(Integer.parseInt(d));
    }
}
