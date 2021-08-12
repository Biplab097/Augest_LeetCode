class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        
        for(String s:strs){
            char[] chars = new char[26];
            for(char c:s.toCharArray()) chars[c-'a']++;
            
            String keyStr = String.valueOf(chars);
            if(!map.containsKey(keyStr)) map.put(keyStr,new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
