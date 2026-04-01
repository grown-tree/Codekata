class Solution {
    public String solution(String s, int n) {  StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 1. 공백일 경우 그대로 추가
            if (ch == ' ') {
                sb.append(ch);
                continue;
            }

            // 2. 대문자인 경우
            if (Character.isUpperCase(ch)) {
                // (현재문자 - 'A'로 0~25 범위를 만듦 + n만큼 밀기) % 26 + 다시 'A' 더하기
                sb.append((char) ((ch - 'A' + n) % 26 + 'A'));
            }
            // 3. 소문자인 경우
            else if (Character.isLowerCase(ch)) {
                // (현재문자 - 'a'로 0~25 범위를 만듦 + n만큼 밀기) % 26 + 다시 'a' 더하기
                sb.append((char) ((ch - 'a' + n) % 26 + 'a'));
            }
        }

        return sb.toString();
    }
}