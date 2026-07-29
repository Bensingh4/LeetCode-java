class Solution {
    public int maxProfit(int[] prices) {
        int minpr=prices[0];
        int max=0;
        int price=0;
        for( int i =1;i<prices.length;i++){
            if( prices[i]<minpr){
                minpr =prices[i];
            }else{
                max=prices[i]-minpr;
                price=Math.max(price,max);
            }
        }
        return price;
    }
}