class Solution {
    public int solution(int price) {
        int answer = 0;
        if(300000> price && price >= 100000){
            answer = price*95/100;
            
        } else if(500000> price && price >= 300000){
            answer = price*90/100;

        } else if(price >= 500000){
            answer = price*80/100;
        } else {
            answer = price;
        }
        return answer;
    }
}