class Solution {
    public int solution(int[] nums) {
            int n = nums.length;
            int answer = 0;
            boolean flag = true;

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {

                        int sum = nums[i] + nums[j] + nums[k];

                        flag = true;

                        // 2부터 해당 수의 제곱근까지 나누어떨어지는지 확인
                        for (int l = 2; l * l <= sum; l++) {
                            if (sum % l == 0) {
                                flag = false; // 나누어떨어지면 소수가 아님
                            }
                        }

                        if (flag) {
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }
}