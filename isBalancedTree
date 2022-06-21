class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return height(root)!=-1;
        
    }
    public int height(TreeNode node)
    {
        if(node==null)
            return 0;
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        int balancedfactor=Math.abs(leftheight-rightheight);
        
        if(balancedfactor>1 || leftheight==-1 || rightheight==-1)
            return -1;
        return 1+Math.max(leftheight,rightheight);
    }
}
