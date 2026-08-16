class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else if(ch>='A' && ch<='Z'){
                ch = (char)(ch-'A'+'a');
                sb.append(ch);
            }
            else if(ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }
        int st=0;
        int end=sb.length()-1;
        while(st<=end){
            int schar=sb.charAt(st);
            int endchar=sb.charAt(end);
            if(schar!=endchar){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}