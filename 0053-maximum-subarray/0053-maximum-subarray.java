class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int val=0;
        for( int i =0;i< nums.length;i++){
          val=val+nums[i];
          max=Math.max(val,max);
          if(val<0){
            val=0;
          }
        }
        return max;

    }
}