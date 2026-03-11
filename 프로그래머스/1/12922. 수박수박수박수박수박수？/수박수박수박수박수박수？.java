class Solution {
    public String solution(int n) {
        //몫만큼 수박 반복 나머지 홀수인경우 수 붙여주기
        String answer = "수박".repeat(n/2);
        String remain = (n % 2 == 1) ? "수" : "";
        
        return answer + remain;
    }
}