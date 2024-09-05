class Solution {
    public int solution(int[] num_list) {
        int answer = 0;        
        int sumsquare = 0;
        int multiple = 1;
        
        int listlength = num_list.length;

        for(int i = 0; i < listlength; i++){
            multiple *= num_list[i];
        }
        for(int i = 0; i < listlength; i++){
            sumsquare += num_list[i];
        }
        
        sumsquare = sumsquare * sumsquare;
        
        if(multiple < sumsquare){
            answer = 1;
        }else
            answer = 0;
        
        return answer;
    }
}