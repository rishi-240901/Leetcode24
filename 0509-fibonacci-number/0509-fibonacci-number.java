class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int ft=0;
        int st=1;
        for(int i=1;i<=n;i++){
            int tt = ft+st; // phle gya n=1 k liye aaya 0+1=1 
            ft=st; //ft=1 phle k lye
            st=tt; // st=1phle k liye pher aage n=2 k liye chalega 
        }
        return ft;
    }
}