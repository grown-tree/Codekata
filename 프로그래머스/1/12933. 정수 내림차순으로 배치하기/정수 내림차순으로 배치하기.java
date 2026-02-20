import java.util.*;

class Solution {
    public long solution(long n) {
        long x = 0;
        String[] answer = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(answer, Collections.reverseOrder());
        
        for(int i = 0; i<answer.length;i++){
            sb.append(answer[i]);
        }
       x= Long.parseLong(sb.toString());
        return x;
    }
}