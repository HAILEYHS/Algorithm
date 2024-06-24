class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;
        
        while(coupons >= 10){
            int newCoupon = coupons / 10;
            answer += newCoupon;
            coupons = (coupons % 10) + newCoupon;
        }
        return answer;
    }
}