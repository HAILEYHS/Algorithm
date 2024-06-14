class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        int shareIndex = 1;
        for(int i=share+1; i<=balls; i++){
            answer = answer * i;
            answer = answer / shareIndex;
            shareIndex++;
        }
        return (int)answer;
    }
}