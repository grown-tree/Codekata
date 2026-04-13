import java.util.*;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);

            // 내림차순 정렬
            Collections.sort(list, Collections.reverseOrder());

            // 명예의 전당 k번째 넘어가면 가장 낮은 점수 제거
            if (list.size() > k) {
                list.remove(k);
            }

            // 최하위 점수 = 제일 마지막꺼 추가
            answer[i] = list.get(list.size() - 1);
        }

        return answer;
    }
}