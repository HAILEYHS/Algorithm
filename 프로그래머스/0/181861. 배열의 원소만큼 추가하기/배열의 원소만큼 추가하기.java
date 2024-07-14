import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList <> ();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            for(int j=0; j<num; j++){
                answer.add(num);
            }
        }
        return answer;
    }
}