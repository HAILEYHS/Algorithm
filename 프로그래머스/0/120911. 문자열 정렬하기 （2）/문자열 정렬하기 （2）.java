class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = my_string.toLowerCase();
        
        char[] charArr = str.toCharArray();
        for(int i = 0; i<charArr.length;i++){
            for(int j=0; j<charArr.length -i-1 ;j++){
                if(charArr[j] > charArr[j+1]){
                    char temp = charArr[j+1];
                    charArr[j+1] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }
        answer = new String(charArr);
        return answer;
    }
}