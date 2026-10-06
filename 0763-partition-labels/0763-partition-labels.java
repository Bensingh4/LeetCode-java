class Solution {
    public List<Integer> partitionLabels(String s) {
    if(s.length()==0)return null;
    List<Integer> output=new ArrayList<>();
    int[] indices= new int[26];
    for( int i =0;i<s.length();i++){
        indices[s.charAt(i)-'a']=i;
    }
    int end=0;
    int start=0;
    for(int i =0;i<s.length();i++){
        end = Math.max(end,indices[s.charAt(i)-'a']);
        if( i == end){
            output.add(end-start+1);
            start=end+1;
        }
    }
    return output;

    }
}