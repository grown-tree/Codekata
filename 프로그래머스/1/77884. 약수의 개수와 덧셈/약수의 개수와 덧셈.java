class Solution {
    public int solution(int left, int right) {
        //left의 약수의 개수count를 구하고 
        //count짝수면 sum+=left; 홀수면 sum-=left한 이후
        // left+=1;
        //left>right이면 반복문 중단하고 리턴쪽으로 아니면 반복
        //return sum
        int sum=0;
        int count=0;
        
        for(int i = left ; i<=right;i++){
            for(int j = 1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
                if(count%2==0){
                    sum+=i;
                }else{
                    sum-=i;
                }
                    count=0;
        }   
        
        return sum;
    }
}