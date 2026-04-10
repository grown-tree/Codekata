class Solution {
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        
        while (n >= a) {
            int exchange = n / a; // 교환 횟수
            answer += exchange * b; // 받는 콜라 수
            n = (exchange * b) +(n % a); // 받은 병+나머지 
        }
        
        return answer;
    }
}