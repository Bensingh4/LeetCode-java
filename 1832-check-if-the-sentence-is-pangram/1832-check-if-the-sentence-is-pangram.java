class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] visited= new int[26];
        for( int i =0;i< sentence.length();i++){
            char ch = sentence.charAt(i);
            visited[ch - 'a'] = 1;

        }
         for( int i =0; i < 26;i++){
            if( visited[i]==0){
                return false;
            }
         }
         return true;
    }
}