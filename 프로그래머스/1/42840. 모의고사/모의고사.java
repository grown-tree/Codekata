import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        //수포자들 패턴
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3]; // 각 수포자의 점수를 저장할 배열
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) scores[0]++;
            if (answers[i] == p2[i % p2.length]) scores[1]++;
            if (answers[i] == p3[i % p3.length]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        
        if (maxScore == scores[0]) list.add(1);
        if (maxScore == scores[1]) list.add(2);
        if (maxScore == scores[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}