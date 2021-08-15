class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtrack(list,new ArrayList<Integer>(),nums);
        return list;
    }
    
    private void backtrack(List<List<Integer>> list, ArrayList<Integer> arr,int[] nums){
        
        if(arr.size()==nums.length){
            list.add(new ArrayList<Integer>(arr));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(arr.contains(nums[i])) continue;
                arr.add(nums[i]);
                backtrack(list,arr,nums);
                arr.remove(arr.size()-1);
            }
        }
    }
}
