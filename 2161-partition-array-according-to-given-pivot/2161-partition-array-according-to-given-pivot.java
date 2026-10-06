class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         
         int i =0;
         int num=0;
         int[] arr= new int[nums.length];
         while(i<nums.length ){
            if(nums[i]<pivot){
             arr[num]=nums[i];
             num++;
            }i++;
         }
         i=0;
         while(i<nums.length){
            if(nums[i]==pivot){
                arr[num]=nums[i];
                num++;
            }
            i++;
         }
         i=0;
         while(i<nums.length){
            
            if(nums[i]>pivot){
                arr[num]=nums[i];
                num++;
            }
            i++;
         }
         return arr;
    }
}