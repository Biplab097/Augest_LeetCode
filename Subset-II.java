class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> empty = new ArrayList<Integer>();
        res.add(empty);
        Arrays.sort(nums);
        for(int i=0; i<n;i++){
            int dupCount = 0;
            while((i+1)<n && nums[i+1]==nums[i]){
                dupCount++;
                i++;
            }
            int prevNum = res.size();
            for(int j=0;j<prevNum;j++){
                List<Integer> arr = new ArrayList<>(res.get(j));
                for(int t=0;t<=dupCount;t++){
                    arr.add(nums[i]);
                    res.add(new ArrayList<Integer>(arr));
                }
            }
            
            
        }
        return res;
    }
}
