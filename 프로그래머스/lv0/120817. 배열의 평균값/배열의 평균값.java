class Solution {
    public double solution(int[] numbers) {
        double add = 0;
        int i = 0;
        for(i=0; i<numbers.length; i++){
             add += numbers[i];
        }
        double answer = add / i;
        return answer;
    }
}