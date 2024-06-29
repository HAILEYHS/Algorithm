class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        
        String [] list = polynomial.split(" ");
        for(int i=0; i<list.length; i++){
            if(list[i].contains("x")){
                if(list[i].equals("x")){
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(list[i].replace("x",""));
                }
            } else if(!list[i].equals("+")){
                num += Integer.parseInt(list[i]);
            }
        }
        
        if(xNum == 1 && num == 0) {
            answer = "x";
        } else if(xNum == 1 && num != 0){
            answer = "x + " + num; 
        } else if (xNum != 0 && num != 0) {
            answer = xNum + "x + " + num;
        } else if (xNum == 0 && num != 0) {
            answer = Integer.toString(num);
        } else if (xNum != 0 && num == 0) {
            answer = xNum + "x";
        } 
        return answer;
    }
}