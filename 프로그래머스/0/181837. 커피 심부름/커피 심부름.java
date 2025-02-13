class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int latte = 0;
        int americano = 0;
        
        for(int i = 0; i<order.length; i++){
            if(order[i].contains("cafelatte")){
                latte ++;
            } else {
                americano ++;
            }
        }
        
        answer = (latte * 5000) + (americano * 4500);      
        return answer;
    }
}