class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> newHash = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        
        while(right < s.length()){
            if(!newHash.contains(s.charAt(right))){
                newHash.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            }
            else{
                newHash.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }
}