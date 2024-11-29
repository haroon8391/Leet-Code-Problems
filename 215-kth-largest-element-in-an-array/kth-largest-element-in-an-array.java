class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> newHeap = new PriorityQueue<>();
        
        for(int num : nums){
            newHeap.add(num);
            
            if(newHeap.size() > k){
                newHeap.poll();
            }
        }
        
        return newHeap.peek();
    }
}