class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0; 
        
        for(int right=0; right<len; right++){
            if(nums[right] == 0){
                continue;
            }
            else{
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        
    }
}