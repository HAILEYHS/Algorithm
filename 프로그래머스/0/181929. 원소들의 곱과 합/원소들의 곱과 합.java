class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus = 0;
        int multiply = 1;
        for(int i = 0; i<num_list.length; i++){
            plus += num_list[i];
            multiply *= num_list[i];
        }
        if((plus*plus) > multiply){
            answer = 1;
        }
        return answer;
    }
}