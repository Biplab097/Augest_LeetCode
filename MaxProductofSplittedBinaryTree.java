class Solution {
    long ans = 0, totalSum = 0;
    private long dfs(TreeNode root){
        
        if(root==null)return 0;
        long currSum = dfs(root.left) + dfs(root.right) + root.val;
        ans = Math.max(ans,(totalSum-currSum)*currSum);
        return currSum;
    }
    
    public int maxProduct(TreeNode root) {
        totalSum = dfs(root);
        dfs(root);
        return (int)(ans % (1e9+7));
    }
}
