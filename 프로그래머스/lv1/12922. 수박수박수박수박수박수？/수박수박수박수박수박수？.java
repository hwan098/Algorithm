class Solution {
    public String solution(int n) {
        String soo = "수";
        String bak = "박";
        String answer = "";
        
        for(int i=0; i<(n / 2); i++){
            answer += soo + bak;
        }
        if(n % 2 != 0){
                answer += soo;
        }
        return answer;
    }
}