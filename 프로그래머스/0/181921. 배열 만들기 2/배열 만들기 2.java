import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = l; i<= r; i++){
            int num = i;
            boolean isValid = true;
            
            while(num > 0){
                int n = num % 10;
                if(n != 0 && n != 5){
                    isValid = false;
                    break;
                }
                num /= 10;
            }
           
            if(isValid){
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}