class Solution {
    public String[] solution(String my_string) {
        String[] words = my_string.split(" ");
        int wordsCount = 0;
        for(int i=0; i<words.length; i++){
            if(!words[i].isEmpty()){
                wordsCount++;
            }
        }
        
        String[] answer = new String[wordsCount];
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(!words[i].isEmpty()){
                answer[count] = words[i];
                count++;
            }
        }
        return answer;
    }
}