class Solution {
    public String solution(String phone_number) {
        
        int len = phone_number.length();//총길이
        
        String realnum = phone_number.substring(len-4,len);//표기할 숫자
        
        String temp = "*".repeat(len-4);//별로 변환
        
        String answer = temp + realnum;
        
        return answer;
    }
}