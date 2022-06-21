class Solution {
    int result=0;
    public int maxDepth(TreeNode root) {
        int depth=1;
        if(root==null)
            return 0;
        return height(root,depth);
        
    }
    public int height(TreeNode node, int depth)
    {
        if(node==null)
         return 0;
        if(node.left==null && node.right==null)
            result=Math.max(result,depth);
        height(node.left,depth+1);
        height(node.right,depth+1);
        return result;
    }
}
