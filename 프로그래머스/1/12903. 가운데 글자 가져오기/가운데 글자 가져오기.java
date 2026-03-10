class Solution {
    public String solution(String s) {
        
        int center = (s.length()/2);
        String answer = "";
        
        if(s.length()%2!=0){
            answer= s.substring(center,center+1);
        }
        if(s.length()%2==0){
            answer=s.substring(center-1, center+1);
        }
        
        return answer;
    }
}