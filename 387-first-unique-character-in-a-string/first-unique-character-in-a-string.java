class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> newHash = new HashMap<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(!newHash.containsKey(arr[i])){
                newHash.put(arr[i], i);
            }
            else{
                newHash.put(arr[i], -1);
            }
        }
        
        for(int i=0; i<n; i++){
            if(newHash.get(arr[i]) != -1){
                return newHash.get(arr[i]);
            }
        }
        
        return -1;
    }
}