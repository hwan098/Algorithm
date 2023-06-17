import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza  = 7;
        
        answer = Math.round(n / pizza);
            
        if(n % pizza != 0){
            answer += 1;
        }
        
        
        
        return answer;
    }
}