class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0] - n);
        
        for(int i=1; i < array.length; i++){
            int num = Math.abs(array[i] - n);
            
            //min이 작은지만 검사해서 코드 실행시엔 통과지만 채점은 틀림
            //min값이 같을때 작은 수를 리턴해야하기 때문에 answer>array[i]가 잇어야함
            if(min>num || (min == num && answer > array[i])){
                min = num;
                answer = array[i];
            }
        }
        return answer;
    }
}