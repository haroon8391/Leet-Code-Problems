class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> newHash = new HashSet<>();
        int j = 0;
        int count = 0;
        int max = 0;

        for(int i=0; i<s.length(); i++){
            if(!newHash.contains(s.charAt(i))){
                newHash.add(s.charAt(i));
                count++;
            }
            else{
                newHash.remove(s.charAt(j));
                j++;
                count--;
                i--;
            }
            max = Math.max(count, max);
        }

        return max;
    }
}