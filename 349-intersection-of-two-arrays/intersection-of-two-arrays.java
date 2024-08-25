class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> values = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        for(int num : nums1){
            if(!values.contains(num)){
                values.add(num);
            }
        }
        
        for(int num: nums2){
            if(values.contains(num)){
                result.add(num);
            }
        }
        
        int[] output = new int[result.size()];
        int j=0;
        for(int num : result){
            output[j] = num;
            j++;
        }
        
        return output;
    }
}