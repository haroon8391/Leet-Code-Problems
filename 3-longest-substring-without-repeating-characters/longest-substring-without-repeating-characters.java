class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> newHash = new HashSet<>();
        int left = 0;
        int right = 0; 
        int maxLength = 0;
        
        while(right < s.length()){
            if(!newHash.contains(s.charAt(right))){
                newHash.add(s.charAt(right));
                right++;
            }
            else{
                newHash.remove(s.charAt(left));
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left);
        }
        
        return maxLength;
    }
}