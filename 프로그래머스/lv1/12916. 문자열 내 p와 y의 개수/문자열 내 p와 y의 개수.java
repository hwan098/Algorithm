class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pNum++;
            }
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'y' ||s.charAt(i) == 'Y'){
                yNum++;
            }
        }
        
        if(pNum == yNum){
            answer = true;
        }
        else if(pNum == 0 && yNum == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        return answer;
    }
}