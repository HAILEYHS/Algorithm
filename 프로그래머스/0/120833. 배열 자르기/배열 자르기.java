class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {   
        int[] answer = new int [num2+1 - num1];
        int a=0;
        for(int i=num1;i<=num2;i++){
            answer[a] = numbers[i];
            a++;
        }
        return answer;
    }
}