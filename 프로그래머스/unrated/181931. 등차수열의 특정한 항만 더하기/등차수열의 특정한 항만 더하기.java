class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] sequence = new int[included.length];
        
        for(int i=0; i<included.length; i++){
            sequence[i] = a;
            a += d;
            
            if(included[i]){
                answer += sequence[i]; 
            }
        }
        return answer;
    }
}