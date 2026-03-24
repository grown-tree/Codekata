import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        List<Integer> arr = new ArrayList<>();
        int answer = 0;
        int num=1;
 
        while(n>0){
            arr.add(n%3);
            n = n/3;
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
            answer +=arr.get(i)*num;
            num*=3;
        }
        
        return answer;
    }
}