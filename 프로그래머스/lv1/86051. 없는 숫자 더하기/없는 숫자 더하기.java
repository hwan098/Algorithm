class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int number = 0;
        for(int i=0; i<=9; i++){
            number += i;  
        }
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];  
        }
        return number - answer;
    }
}