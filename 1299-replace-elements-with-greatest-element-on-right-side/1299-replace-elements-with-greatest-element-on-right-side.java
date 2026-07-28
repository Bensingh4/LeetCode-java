class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newar= new int[arr.length];
        int c =0;

        for( int i =0;i<arr.length-1;i++){
            int maxval=-1;
            for( int j =i+1;j< arr.length;j++){
                maxval=Math.max(arr[j],maxval);
            
            }
            newar[c]=maxval;
            c++;
        }
        newar[arr.length-1]=-1;
        return newar;
    }
}