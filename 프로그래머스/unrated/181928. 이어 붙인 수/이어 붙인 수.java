class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";  
        int sumEven = 0;
        int sumOdd = 0;
        
        for(int i=0; i<num_list.length; i++){
           if(num_list[i] % 2 == 0){
               even +=  Integer.toString(num_list[i]);
           }
           else{
               odd +=  Integer.toString(num_list[i]);
           } 
        }
        sumEven = Integer.parseInt(even);
        sumOdd = Integer.parseInt(odd);
        answer = sumEven + sumOdd;
        
        return answer;
    }
}