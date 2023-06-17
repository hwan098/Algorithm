class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddCount = 0;
        int evenCount = 0;
        
        for(int i=0; i<num_list.length; i++){   
            if(num_list[i] % 2 == 0){
                evenCount += 1;
            }
            else{
                oddCount += 1;
            }
        }
        
        answer[0] = evenCount;
        answer[1] = oddCount;
        
        return answer;
    }
}