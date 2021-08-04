class Solution {
    
    public void dfs(TreeNode root, int sum,List<Integer> arr,List<List<Integer>> res){
        if(root.left==null && root.right==null && root.val==sum){
            arr.add(root.val);
            res.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
        }
        if(root.left!=null){
            arr.add(root.val);
            dfs(root.left,sum-root.val,arr,res);
            arr.remove(arr.size()-1);
        }
        if(root.right!=null){
            arr.add(root.val);
            dfs(root.right,sum-root.val,arr,res);
            arr.remove(arr.size()-1);
        }
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<Integer>();
        if(root==null)return res;
        dfs(root,targetSum,arr,res);
        return res;
        
    }
}
