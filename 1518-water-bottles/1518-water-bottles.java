class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;  //jaise nb=15 ne=4 ans=15

        while(numBottles>=numExchange){//phle 15>=4  ab dusre k liye 6>=4
            int newBottles=numBottles/numExchange; // phle 15%4=3  // ab 6%4=1
            int remBottles=numBottles%numExchange; //phle 15/4=3  // 6/4=2
            ans=ans + newBottles; // ans=15+3-18  //1+1
            numBottles=newBottles+remBottles; // 3+3=6 aagya toh ab nb m 6 hogya 15 k liy 

        }
        return ans; // last m ans aajega
    }
}