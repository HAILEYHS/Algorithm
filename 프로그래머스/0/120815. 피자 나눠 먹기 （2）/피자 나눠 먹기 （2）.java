class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n*6; i++){
            int num = i*6;
            if(num%n == 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}