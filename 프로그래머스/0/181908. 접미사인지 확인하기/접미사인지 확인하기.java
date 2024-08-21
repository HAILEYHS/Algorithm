class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(is_suffix.length() > my_string.length()){
            return answer;
        }
        int index = my_string.length() - is_suffix.length();
        String suffix = my_string.substring(index);
        if(suffix.equals(is_suffix)){
            answer =1;
        }
        return answer;
    }
}