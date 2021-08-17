class Solution {
    public int goodNodes(TreeNode root) {
        
        return helper(root,-10000);
    }
    public int helper(TreeNode root,int min){
        
        if(root==null) return 0;
        
        int res = root.val>=min?1:0;
        
        res += helper(root.left,Math.max(min,root.val));
        res += helper(root.right,Math.max(min,root.val));
        
        return res;
    }
}
