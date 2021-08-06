class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null){
            return res;
        }
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> arr = new ArrayList<Integer>();
            while(n>0){
                Node node = q.peek();
                q.remove();
                arr.add(node.val);
                for(int i=0;i<node.children.size();i++){
                    q.add(node.children.get(i));
                }
                n--;
            }
            res.add(arr);
        }
        
        return res;
        
    }
}
