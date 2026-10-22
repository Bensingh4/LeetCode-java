class Solution {
    public int singleNumber(int[] nums) {
         int n=0;
     for( int i =0;i< nums.length;i++){
        n=0;
        for( int j =0;j< nums.length;j++){
if( nums[i]==nums[j]){
    n++;
}

        }
        if(n==1){
            return nums[i];
        }
     }
     return -1;
    }
}