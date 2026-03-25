import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> arr = new ArrayList<>(Arrays.asList(s.split("", -1)));
        List<String> arr1 = new ArrayList<>();
        int flag = 0;//홀짝 판별하는 숫자

        for (int i = 0; i < arr.size(); i++) {
            String word = arr.get(i);//현재글자

            if(" ".equals(word)){
                arr1.add(" ");
                flag = 0;

            } else {
                if (flag %2 == 0) {
                    arr1.add(word.toUpperCase());
                } else{
                    arr1.add(word.toLowerCase());
                }
                flag++;
            }

        }

        for (String str: arr1) {
            answer += str;
        }

        return answer;
    }
}