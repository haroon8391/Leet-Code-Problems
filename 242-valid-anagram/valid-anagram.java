class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];

        for(char z : s.toCharArray()){
            count[z - 'a'] += 1;
        }

        for(char z : t.toCharArray()){
            if(count[z - 'a'] == 0){
                return false;
            }
            else{
                count[z - 'a'] -= 1;
            }
        }

        return true;
    }
}