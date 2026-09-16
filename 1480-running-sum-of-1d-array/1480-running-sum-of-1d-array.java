class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[]  arr= new int[nums.length];
        for( int i =0;i< nums.length;i++){
            arr[i]=sum+nums[i];
            sum=sum+nums[i];
        }
        return arr;
    }
}