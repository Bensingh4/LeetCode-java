class Solution {
    public int maxProduct(int[] nums) {
        int sum =0;
        int max =0;
        for (int i =0;i< nums.length-1;i++){
            for ( int j= i+1;j<nums.length;j++){
sum=((nums[i]-1 )*(nums[j]-1));
max=Math.max(sum,max);
            }
        }
        return max;
    }
}