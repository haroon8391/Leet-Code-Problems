class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charCount = new HashMap();
        
        for (char z : magazine.toCharArray()){
            charCount.put(z, charCount.getOrDefault(z, 0) + 1);
        }

        for(char z : ransomNote.toCharArray()){
            if(!charCount.containsKey(z) || charCount.get(z) == 0){
                return false;
            }
            charCount.put(z, charCount.get(z) - 1);
        }
        return true;
    }
}