class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i= 0; i<myString.length(); i++){
            String str = myString.charAt(i)+"";
            if(str.equals("a")){
                str = str.toUpperCase();
            } else if(str.equals("A")){
                str = str;
            } else {
                str = str.toLowerCase();
            }
            answer += str;
        }
        return answer;
    }
}