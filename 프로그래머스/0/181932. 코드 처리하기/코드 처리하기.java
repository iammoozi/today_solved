class Solution {
    public String solution(String code) {
        String answer = "";
        boolean flag = true;
        
        int clength = code.length();
        
        for(int i = 0; i< clength; i++){
            if (flag){
                if(code.charAt(i) == '1'){
                    flag = false;
                }
                else if(i % 2 == 0){
                    answer += code.charAt(i);
                }
            }
            else if(!flag){
                if(code.charAt(i) == '1'){
                    flag = true;
                }   
                else if(i % 2 == 1){
                    answer += code.charAt(i);
                }
            }
            
        }
        if(answer.isEmpty()){
            answer +="EMPTY";
        }
        return answer;
    }
}