class Solution {
    public void moveZeroes(int[] nums) {
        int ln =0;
        for ( int i =0;i< nums.length;i++){
            if( nums[i]!=0){
                nums[ln]=nums[i];
                ln++;
            }
        }
        while(ln<nums.length){
            nums[ln]=0;
            ln++;
        }
    }
}