class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        if(arr.length % 2 == 0){
            for(int i=1; i<answer.length; i++){
                answer[i] += n;
                i++;
            }
        } else {
            for(int i=0; i<answer.length; i++){
                answer[i] += n;
                i++;
            }
        }
        return answer;
    }
}