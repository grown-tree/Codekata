class Solution {
    public long solution(long n) {
        //양의 정수 x의 제곱인지 아닌지 판단
        long x = 1;
        
        while(x*x<=n){
             if (x * x == n) {
                return (x + 1) * (x + 1);
            }
            x++;
        }
    
        return -1;
        
        
        
        
    }
}