class Solution {
    public String decodeString(String s) {
        Stack <String> str= new Stack<>();
        Stack<Integer> num=new Stack<>();
        int n=0;
        String curr="";
        for( char ch : s.toCharArray()){
            if( ch=='['){
                str.push(curr);
                num.push(n);
                curr="";
                n=0;
            }
            else if( Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }else if( ch==']'){
                String temp=str.pop();
                int val= num.pop();
                String repeated = "";
                for (int i = 0; i < val; i++) {
                    repeated += curr;
            }
            curr=temp+repeated;
        }else{
                curr+=ch;}}
        return curr;
    }
}