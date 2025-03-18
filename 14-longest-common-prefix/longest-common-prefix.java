class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int n=strs.length;
        String str = strs[0];

        for(int i=0; i<n; i++){
            while(strs[i].indexOf(str) != 0){
                str = str.substring(0, str.length() - 1);
                if(str.length() == 0) return "";
            }
        }

        return str;
    }
}