class Solution {
    public static int fibNo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibNo(n-1)+fibNo(n-2);
    }
    public int fib(int n) {
        return fibNo(n);
    }
}