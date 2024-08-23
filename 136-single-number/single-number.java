class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        
        for(int num : nums){
            if(values.contains(num)){
                values.remove(num);
            }
            else{
                values.add(num);
            }
        }
        
        return values.iterator().next();
    }
}