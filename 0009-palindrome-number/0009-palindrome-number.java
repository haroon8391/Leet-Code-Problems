class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int len = arr.length;
        
        for(int i=0; i<len; i++){
            if(arr[i] == arr[len - i - 1]){
                continue;
            }
            return false;
        }
        
        return true;
    }
}