class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        int a_ex = a*a;
        int b_ex = b*b;
        int c_ex = c*c;
        
        if (a == b && b == c){  
            answer = answer * (a_ex + b_ex + c_ex) * ((a_ex*a) + (b_ex*b) + (c_ex*c));
        } else if(a == b || a == c || b == c){
            answer = answer * (a_ex + b_ex + c_ex);
        }
        return answer;
    }
}