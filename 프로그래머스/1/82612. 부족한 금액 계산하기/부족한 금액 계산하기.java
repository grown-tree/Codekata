class Solution {
    public long solution(int price, int money, int count) {
        //price= 이용료, n번째 이용료는 n*price
        //총 이용료sum_price += n*price인데 n = 1~count까지
        long sumPrice = 0;
        
        for(int i = 1; i<=count;i++){
            sumPrice = sumPrice + (i*price);
        }
        

        return sumPrice>money? sumPrice-money:0;
    }
}