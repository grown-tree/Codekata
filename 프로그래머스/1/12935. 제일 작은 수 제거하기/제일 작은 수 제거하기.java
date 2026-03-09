class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length -1];
        int minNum = 0;
        int index = 0;
        
        if (arr.length == 1) {
            return new int[]{-1};
        }else{
            minNum = arr[0];
            for(int i = 1;i<arr.length;i++){
                if(minNum>arr[i]){
                    minNum = arr[i];
                }
            }
            
            for (int i = 0; i < arr.length; i++) {
                
                if (arr[i] == minNum) {
                    continue;
                }
                answer[index++] = arr[i];
            }
            return answer;
        }
    }
}