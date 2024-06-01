import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        int answer= 0;
        List <Integer> numList = new ArrayList<>();
        String num = "";
        
        for(int i=0; i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                num += ch;
            } else {
                if(!num.isEmpty()){
                    numList.add(Integer.parseInt(num));
                    num="";
                }
            }
        }
        if(!num.isEmpty()){
            numList.add(Integer.parseInt(num));
        }
        for(int i=0; i<numList.size();i++){
            answer += numList.get(i);
        }
        return answer;
    }
}