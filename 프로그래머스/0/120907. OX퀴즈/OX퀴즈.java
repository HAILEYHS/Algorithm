class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        String[][] str = new String[quiz.length][5];
        int result = 0;
        for(int i=0; i<quiz.length; i++){
            str [i] = quiz[i].split(" ");
            if(str[i][1].equals("-")){
                result = Integer.parseInt(str[i][0]) - Integer.parseInt(str[i][2]);
                if(result == Integer.parseInt(str[i][4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if(str[i][1].equals("+")){
                result = Integer.parseInt(str[i][0]) + Integer.parseInt(str[i][2]);
                if(result == Integer.parseInt(str[i][4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } 
        }
        return answer;
    }
}