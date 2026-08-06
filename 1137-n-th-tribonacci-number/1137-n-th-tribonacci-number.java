class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int ft=0;
        int st=1; // isme dekho teen nnumber h toh ft leliya st and tt
        int tt=1;
        for(int i=1;i<=n;i++){
            int ftt=ft+st+tt; // ftt=phle teeno ka sum
            ft=st;
            st=tt;
            tt=ftt;
        }
        return ft; // baad m return krdo
    }
}