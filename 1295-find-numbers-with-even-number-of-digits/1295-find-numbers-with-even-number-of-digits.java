class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int m =0;
        for( int i =0;i< nums.length;i++){
            c=0;
            int num=nums[i];
            while(num>0){
            num/=10;
            
                c++;
            }
            if( c%2==0){
                m++;
            }
        }
        return m;
    }
}