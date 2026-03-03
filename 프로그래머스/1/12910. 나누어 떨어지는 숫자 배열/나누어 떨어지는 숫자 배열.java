import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        //arr요소를 하나씩 꺼내서 divisor로 나누기
        //나눴을때 나누어 떨어지는 값을 배열에 넣기
        //배열을 오름차순으로 정렬하기
        //정렬한 배열 반환하기
        
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int  i : arr){
            if(i%divisor==0){
                System.out.println("i:"+i);
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        Collections.sort(list);//오름차순 정렬
        
        //리스트를 배열로 변환
        answer = list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        return answer;
    }
}