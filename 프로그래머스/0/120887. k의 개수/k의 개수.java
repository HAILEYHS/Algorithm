class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String number = "";
        for(int num=i; num<=j; num++){
            number+=num;
        }
        for(int num=0;num<number.length();num++){
            char ch = number.charAt(num);
            if(ch-'0' == k){
                answer ++;
            }
        }
        return answer;
    }
}