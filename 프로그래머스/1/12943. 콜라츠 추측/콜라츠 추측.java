class Solution {
    public int solution(int num) {
        
        if (num == 1) return 0;
        
        long longNum = (long) num;
        int count = 0;
        
        while (longNum != 1 && count < 500) {
            if (longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = (longNum * 3) + 1;
            }
            count++;
        }
        
        return (longNum == 1) ? count : -1;
    }
}