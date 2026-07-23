class Solution {
    public int hIndex(int[] citations) {
        // 3 0 6 1 5 toh jaie manlo 5 paper h toh phle manlo jaise 1 - h toh jaise manno 1 kis kis m aaya h jaise 3 6 1  5 m aaya mtlb jaise phle 1 aaya toh mini dekhenge ki 1 aur usse jyada kiss m aayw h ltb 1 toh hone hi chahiye pher aaya 3 toh dekho 3 m aaya pher 6 m pher 5 m toh 3 hogye mtlb yeh shi h pher aaya 5 dekha 5 se jyada ya = bs do hi h toh h-index = 3
        Arrays.sort(citations); // 0 1 3 5 6
        int n=citations.length; 
        for(int i=0;i<n;i++){  
            if(citations[i]>=n-i){  //phle c[i]=0 > 5-0 no  baad m c[i=2]= 3 >=5-2 3>=3 yes 
                return n-i; //5-2 =3
            }
        }
        return 0;
    }
}