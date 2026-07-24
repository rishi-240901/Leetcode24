class Solution {
    public String addBinary(String a, String b) {
        //DEkHO BHAI phli baat su dekho 0+1 =1 c=0  1+0=1 c=0 1+1=0 c=1
        // so apn ko sum chahiye inka iske like apn kya kr skte h vaise toh 1+1 =2  toh sum%2=2%2=0 aagya and carry k liye humko 1 chahiye uske liye sum/2 krskte h 1
        // toh hum stringbuiler banayenge kyuki humko string m return krna h 
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry==1){
            int sum=carry; // phle sum ko bhi 0 rkhlo 
            //ab dekho hume add toh integr m krna padega toh iske liye toh 0-48 and 1-49 hota h toh hum kaie krnge a=011 and b=001 toh isko kenge like a.charAt(i)-'0'=toh =49-48=1
            if(i>=0){
                sum=sum+a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum=sum+b.charAt(j)-'0';
                j--;
            }
             sb.append(sum%2);
             carry=sum/2;
        }
        return sb.reverse().toString();
    }
}