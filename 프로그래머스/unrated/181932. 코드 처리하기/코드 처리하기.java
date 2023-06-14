class Solution {
    
    public static String solution(String code) {
       String ret = "";
       char mode = '0';
       for(int i = 0; i < code.length(); i++) {
           if(code.charAt(i) == '1') {
              mode = mode == '0' ? '1' : '0';
              continue;
           }
          if(mode == '0') {
              if(i % 2 == 0) {
                 ret += code.charAt(i);
              }
          }
          else {
             if(i % 2 != 0) {
                ret += code.charAt(i);
             }
          }
       }
       if(ret.equals("")){
           ret = "EMPTY";
       }
        return ret;
    }
}