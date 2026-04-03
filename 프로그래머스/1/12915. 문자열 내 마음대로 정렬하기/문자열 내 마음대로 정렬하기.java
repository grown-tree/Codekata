import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
       //정렬규칙
        Arrays.sort(strings, (s1, s2) -> {

            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 != c2) {
                return c1 - c2;
            }

            int minLen = Math.min(s1.length(), s2.length());

            //앞에서부터 비교해가며 다른경우 사전순처리
            for (int i = 0; i < minLen; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.charAt(i) - s2.charAt(i);
                }
            }

            return s1.length() - s2.length();
        });


        return strings;
    }
}