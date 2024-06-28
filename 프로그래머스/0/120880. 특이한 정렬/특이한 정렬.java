import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = numlist;
        Arrays.sort(answer);
        for(int i=0; i<numlist.length; i++){
            for(int j=0; j<numlist.length; j++){
                if(Math.abs(n - answer[i]) <= Math.abs(n - answer[j])){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }    
            }
        }
        return answer;
    }
}