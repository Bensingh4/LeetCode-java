class Solution {
    public int largestAltitude(int[] gain) {
        int apt=0;
        int high=0;
        for( int i =0; i< gain.length;i++){
            apt+=gain[i];
            if( apt> high){
                high=apt;
            }
        }
        return high;
    }
}