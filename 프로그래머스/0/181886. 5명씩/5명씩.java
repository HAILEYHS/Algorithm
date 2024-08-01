class Solution {
    public String[] solution(String[] names) {
        int listCount =  (names.length + 4) / 5;
        String[] answer = new String [listCount];
        int num = 1;
        answer[0] = names[0];
        for(int i=5; i<names.length; i+=5){
            answer[num] = names[i];
            num++;
        }
        return answer;
    }
}