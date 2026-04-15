class Solution {
    
    public String solution(int a, int b) {

        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int totalDays = 0;

        for (int i = 0; i < a-1; i++) {
            totalDays += monthDays[i];
        }
        
        totalDays+=b;

        return days[totalDays % 7];
    }
}