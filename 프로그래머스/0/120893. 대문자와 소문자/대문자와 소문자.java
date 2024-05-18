class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] str = new char [my_string.length()];
        
        for(int i=0; i<my_string.length();i++){
            str[i] = my_string.charAt(i);
            if(65<=str[i] && str[i]<=90){
                str[i] = (char) (str[i] + 32);
            } else if (97<=str[i] && str[i]<=122) {
                str[i] = (char) (str[i] - 32);
            } 
        }
        answer = new String (str);
        return answer;
    }
}