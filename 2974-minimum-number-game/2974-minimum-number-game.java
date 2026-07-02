class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr= new int[nums.length];
        int k =0;
        for ( int i =0;i<nums.length;i+=2){
            arr[k]= nums[i+1];
            k++;
            arr[k]=nums[i];
            k++;

        }
        return arr;
    }
}