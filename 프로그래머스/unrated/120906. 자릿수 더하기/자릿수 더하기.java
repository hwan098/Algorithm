class Solution {
    public int solution(int n) {
        int answer = 0;
        //정수형n을 문자열로 바꾼다.
        String s = Integer.toString(n);
        //1234의 길이만큼 반복
        for(int i=0; i<s.length(); i++){
            //문자열인 s를 1234 중 1을 잘라 answer에 정수형으로 저장
            answer += Integer.parseInt(s.substring(i, i+1)); 
        }
        
        return answer;
    }
}