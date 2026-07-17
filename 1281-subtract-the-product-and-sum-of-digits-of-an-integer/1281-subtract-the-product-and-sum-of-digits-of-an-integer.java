class Solution {
    public int subtractProductAndSum(int n) {
        String[] nums= String.valueOf(n).split("");
int[] num= new int[nums.length];
for( int i =0;i< nums.length;i++){
    num[i]= Integer.parseInt(nums[i]);

}
int pdt=1;
for( int i =0;i<num.length;i++){
    pdt *= num[i];
}
int sum=0;
for( int i =0;i< num.length;i++){
    sum+= num[i];
}
int res =0;
 res= pdt - sum;
 return res ;

    }
}