class Solution {
    public int[] solution(int[] num_list, int n) {
        int listNum = (num_list.length+n-1)/n;
        int[] answer = new int [listNum];
        int index=0;
        for(int i=0; i<num_list.length; i+=n){
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}