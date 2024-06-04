class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        int j=0;
        
        for(int i=0; i<len; i++){
            if(nums[i] == val){
                j++;
            }
            else{
                nums[i-j] = nums[i];
                count++;
            }
        }
        
        return count;
    }
}