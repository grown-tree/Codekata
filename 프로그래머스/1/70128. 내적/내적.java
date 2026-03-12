class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length;i++){
            System.out.printf("%d*%d", a[i], b[i]);
                System.out.printf(" + ");
            answer = answer+(a[i]*b[i]);
        }
        System.out.printf("= %d",answer);
        
        return answer;
    }
}