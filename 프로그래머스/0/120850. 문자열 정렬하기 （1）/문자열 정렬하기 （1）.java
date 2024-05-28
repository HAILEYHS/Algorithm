import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList <Integer>();
        
        for(int i=0; i<my_string.length();i++){
            char num = my_string.charAt(i);
            
            if((48<=num)&& num<=57){
                answer.add((int)num-48);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}