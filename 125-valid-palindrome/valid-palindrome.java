class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char z : s.toCharArray()){
            
            if(Character.isLetterOrDigit(z)){
                sb.append(Character.toLowerCase(z));
            }
        }
        
        String newStr = sb.toString();
        int left = 0;
        int right = newStr.length() - 1;
        
        while(left < right){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}