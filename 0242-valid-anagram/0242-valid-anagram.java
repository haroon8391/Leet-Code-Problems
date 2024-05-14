class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.toCharArray().length != t.toCharArray().length){
            return false;
        }
        
        int[] arr = new int[26];
        
        for(char z : s.toCharArray()){
            arr[z - 'a'] += 1;
        }
        
        for(char z : t.toCharArray()){
            if(arr[z - 'a'] > 0){
                arr[z - 'a'] -= 1;
            }
            else{
                return false;
            }
        }
     
        return true;
    }
}