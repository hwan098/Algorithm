import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        int sToInt = 0;
        
        for(int i=0; i<str.length(); i++){
            char s = str.charAt(i);

            answer += s-'0';
        }
        
        return answer;
    }
}