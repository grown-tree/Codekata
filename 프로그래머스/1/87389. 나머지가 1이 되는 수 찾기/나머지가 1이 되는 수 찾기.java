class Solution {
    public int solution(int n) {
        int x = 1;
    
        for(x = 1; x<=n;x++){
            if(n % x == 1){
                return x;
            }
        }
        
        return x;
    }
}