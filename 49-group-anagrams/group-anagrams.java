class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> mapValues = new HashMap<>();
        
        for(String str: strs){
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);
        
            if(!mapValues.containsKey(newStr)){
                mapValues.put(newStr, new ArrayList<>());
            }
            
            mapValues.get(newStr).add(str);
        }
        
        return new ArrayList<>(mapValues.values());
    }
}