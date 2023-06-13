class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        String cd = c.concat(d);
        String dc = d.concat(c);
        if(Integer.parseInt(cd) > Integer.parseInt(dc)){
            answer = Integer.parseInt(cd);
        }
        else{
            answer = Integer.parseInt(dc);
        }
        
        return answer;
    }
}