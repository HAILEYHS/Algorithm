import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int count = 0;
        Arrays.sort(num_list);
        for(int i=0; i<5; i++){
            answer[count] = num_list[i];
            count++;
        }
        return answer;
    }
}