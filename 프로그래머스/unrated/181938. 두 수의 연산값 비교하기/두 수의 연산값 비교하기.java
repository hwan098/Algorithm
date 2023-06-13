class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        String cd = c + d;
        
        if(Integer.parseInt(cd) > (a*b*2)){
            answer = Integer.parseInt(cd);
        }
        else{
            answer = a * b * 2;
        }
        return answer;
    }
}