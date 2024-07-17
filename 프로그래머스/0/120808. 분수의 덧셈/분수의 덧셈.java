class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = ((numer1*denom2) + (numer2*denom1));
        int b = (denom1*denom2);
        
        int temp1 = a;
        int  temp2 = b;
        
        while (temp2 != 0) {
            int temp3 = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp3;
        }
        int[] answer = {a/temp1, b/temp1};
        return answer;
    }
}