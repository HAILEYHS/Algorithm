class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int strNum = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        
        answer = strNum > (2*a*b) ? strNum : (2*a*b);
        return answer;
    }
}