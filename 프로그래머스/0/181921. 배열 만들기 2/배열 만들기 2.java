import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = l; i<= r; i++){
            String str = Integer.toString(i);
            boolean isValid = true;
            
            for(char c : str.toCharArray()){
                if(c != '0' && c != '5'){
                    isValid = false;
                    break;
                }
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