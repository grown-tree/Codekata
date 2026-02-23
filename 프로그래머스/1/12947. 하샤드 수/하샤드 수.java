class Solution {
    public boolean solution(int x) {
        
        int num = x;
        int divNum = 0;
        
        while(num>0){
            divNum += num%10;
            num /=10;
        }
        
        return (x%divNum==0);
    }
}