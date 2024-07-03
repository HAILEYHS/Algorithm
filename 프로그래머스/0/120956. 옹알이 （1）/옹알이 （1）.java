class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] list = {"aya", "ye", "woo", "ma"}; 
        for(int i=0; i<babbling.length; i++){
            String str = babbling[i]; 
            for(int j = 0; j < list.length; j++) {
                str = str.replace(list[j], " "); 
            }
            if(str.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }
        return answer;
    }
}