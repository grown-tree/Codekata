class Solution {
   public int solution(String s) {
        
        String[] words = {"zero", "one", "two", "three", "four", "five",
                          "six", "seven", "eight", "nine"};

        for (int i = 0; i < words.length; i++) {
            //문자열중 words와 일치하는 문자가있으면 인덱스번호로 교체
            s = s.replace(words[i], Integer.toString(i));
        }
        
        //숫자로 변환하여 리턴
        return Integer.parseInt(s);
    }
}