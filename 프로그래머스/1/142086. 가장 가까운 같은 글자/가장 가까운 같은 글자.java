class Solution {
    public int[] solution(String s) {
        
      int[] answer = new int[s.length()];
       
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int result = -1; // 기본값은 -1 (못 찾았을 때)

            // 해당 인덱스(i) 이전부터 0번까지 거꾸로 검색
            for (int j = i - 1; j >= 0; j--) {
                if (current == s.charAt(j)) {
                    result = i - j;
                    break;
                }
            }
            answer[i] = result;
        }
        return answer;
        }
}