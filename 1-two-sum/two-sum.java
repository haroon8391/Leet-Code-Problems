class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newHash = new HashMap<>();
        int n = nums.length;
        int[] output = new int[2];

        for(int i=0; i<n; i++){
            int comp = target - nums[i];

            if(newHash.containsKey(comp)){
                output[0] = newHash.get(comp);
                output[1] = i;
                return output;
            }

            newHash.put(nums[i], i);
        }

        return new int[] {};
    }
}