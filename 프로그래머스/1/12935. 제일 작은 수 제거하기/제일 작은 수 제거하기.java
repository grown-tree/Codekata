import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length <= 1) return new int[]{-1};

        // 1. 최솟값을 찾는다
        int min = Arrays.stream(arr).min().getAsInt();
        
        // 2. 최솟값만 제외하고(filter) 나머지를 배열로 만든다
        return Arrays.stream(arr).filter(i -> i != min).toArray();
        
    }
}