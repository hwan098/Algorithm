class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String str = my_string.substring(0, s);
        String answer = str + overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        
        return answer;
    }
}