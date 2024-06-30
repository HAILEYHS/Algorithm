import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        int [] frequent = new int [1000];
        
        for(int i=0; i<array.length; i++){
            frequent[array[i]] ++;
            if(maxCount < frequent[array[i]]){
                maxCount = frequent[array[i]];
                answer = array[i];
            }            
        }
        
        int duplication = 0;
        for(int i=0; i<frequent.length; i++){
            if(maxCount == frequent[i]){
                duplication ++;
            }
            if(duplication > 1){
                answer = -1;
            }
        }        
        return answer;
    }
}