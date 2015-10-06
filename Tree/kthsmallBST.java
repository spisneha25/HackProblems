public class Solution 
{
    private ArrayList<Integer> al;
    public int kthSmallest(TreeNode root, int k) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        inorder(root, al);
        return al.get(k - 1);        
    }
    
    private void inorder(TreeNode root, ArrayList<Integer> al)
    {
        if(root != null)
        {
            inorder(root.left, al);
            al.add(root.val);
            inorder(root.right, al);
        }
    }
}
