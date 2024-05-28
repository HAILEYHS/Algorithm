class Solution {
    public int solution(int num, int k) {
        
        String number = Integer.toString(num);
        String i = Integer.toString(k);
        int answer = number.indexOf(i);
        if(answer >= 0){
          answer += 1;
        } 
        return answer;
    }
}