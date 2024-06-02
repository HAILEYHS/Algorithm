import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] char1 = before.toCharArray();
        char[] char2 = after.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        before=new String(char1);
        after = new String(char2);
        
        if(before.equals(after)){
            answer=1;
        }
        return answer;
    }
}