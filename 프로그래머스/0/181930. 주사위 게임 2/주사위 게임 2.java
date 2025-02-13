class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        if(a == b || a == c || b == c){
            if (a == b && b == c){
                int a_ex = a*a;
                int b_ex = b*b;
                int c_ex = c*c;
            
                answer = answer * (a_ex + b_ex + c_ex) * ((a_ex*a) + (b_ex*b) + (c_ex*c));
                return answer;
            }
            answer = answer * ((a*a) + (b*b) + (c*c));
        }
        return answer;
    }
}