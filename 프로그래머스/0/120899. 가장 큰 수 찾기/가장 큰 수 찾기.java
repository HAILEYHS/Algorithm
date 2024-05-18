class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        int count = 0;
        for(int i =0; i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    answer[0] = array[j];
                    answer[1]= j;
                } else {
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }
        }
        return answer;
    }
}