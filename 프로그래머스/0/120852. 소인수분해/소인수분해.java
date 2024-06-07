import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                    n = n/i;
                }
                answer.add(i);
            }
        }
        return answer;
    }
}