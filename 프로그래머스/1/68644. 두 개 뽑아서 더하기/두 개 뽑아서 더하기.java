import java.util.TreeSet;
class Solution {
      public int[] solution(int[] numbers) {

        TreeSet<Integer> set = new TreeSet<>();//중복제거와 오름차순정렬한번에
        int[] answer = {};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = set.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}