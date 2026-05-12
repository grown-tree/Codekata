class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int correct = 0;
        int zeroCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    correct++;
                    break;
                }
            }
        }
        
        int maxCorrect = correct + zeroCount;
        int minCorrect = correct;

        // 순위 계산
        int highest = Math.min(7 - maxCorrect, 6);
        int lowest = Math.min(7 - minCorrect, 6);

        return new int[]{highest, lowest};
    }
}