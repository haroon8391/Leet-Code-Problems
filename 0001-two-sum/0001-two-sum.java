class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] output = new int[2];
        
        HashMap<Integer, Integer> values = new HashMap<>();
        
        for(int i=0; i<len; i++){
            int comp = target - nums[i];
            
            if(values.containsKey(comp)){
                output[0] = values.get(comp);
                output[1] = i;
                return output;
            }
            
            values.put(nums[i], i);
        }
        
        return new int[] {};
    }
}