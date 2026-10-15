class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que= new PriorityQueue<>();
        for( int n:nums){
            que.add(n);
            if(que.size()>k){
                que.poll();
            }
        }
        return que.peek();
    }
}