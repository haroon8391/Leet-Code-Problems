class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        char[] newArr = s.toCharArray();
        
        for(char z : newArr){
            if(z == '(' || z == '{' || z == '['){
                stack.push(z);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                
                char b = stack.pop();
                
                if((z == ')' && b != '(') || 
                   (z == '}' && b != '{') || 
                   (z == ']' && b != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}