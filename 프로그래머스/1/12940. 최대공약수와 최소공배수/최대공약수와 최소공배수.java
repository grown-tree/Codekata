class Solution {
    public int[] solution(int n, int m) {
        //최대공약수 = 1~ 둘중 작은 수까지 둘다나눠지는 수 중 큰수
        //최소공배수 = 두수의 곱을 최대공약수로 나누기
        
        int gcd = 1;//최대공약수
        int min = Math.min(n,m);
        
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i; // 가장 마지막에 남는 게 최대공약수
            }
        }
        
        int lcm = (n * m)/gcd;
        
        int[] answer = {gcd,lcm};
        
        return answer;
    }
}