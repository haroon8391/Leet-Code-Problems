class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> newHash = new HashMap<>();
        
        for(char z : s.toCharArray()){
            newHash.put(z, newHash.getOrDefault(z, 0) + 1);
        }
        
        for(char z: t.toCharArray()){
            if(!newHash.containsKey(z)){
                return false;
            }
            
            newHash.put(z, newHash.get(z) - 1);
            if(newHash.get(z) == 0){
                newHash.remove(z);
            }
        }
        
        return true;
    }
}