class Solution {
    public String solution(int[] food) {
         StringBuilder sb = new StringBuilder();
// 푸드 파이트 대회 문제
        //중앙에 물(0번 인덱스) 제외 왼쪽음식먼저 배치
        for (int i = 1; i < food.length; i++) {
            // 해당 음식을 2로 나눈 몫만큼 반복해서 추가
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }

        String leftSide = sb.toString();
        
        //왼쪽 음식과 물 배치후 뒤집어서 붙임
        return leftSide + "0" + sb.reverse().toString();
    }
}