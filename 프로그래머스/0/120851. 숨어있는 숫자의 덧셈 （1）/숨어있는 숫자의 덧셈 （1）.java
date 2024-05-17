class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int a=0;
        for(int i=0;i<my_string.length();i++){
            a = my_string.charAt(i)-'0';
            if(a<10){
                answer += a;
            }
        }
        return answer;
    }
}