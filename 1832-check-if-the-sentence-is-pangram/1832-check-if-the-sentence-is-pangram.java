class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq=new int[26];
        if(sentence.length() <26){
            return false;
        }
        for( char ch : sentence.toCharArray()){
            freq[ch-'a']++;
        }
        for( int i =0;i< 26;i++){
if(freq[i]==0){
    return false;
}
        }
        return true;
    }
}