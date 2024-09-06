import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        int endlist = num_list[num_list.length-1];
        int endlistb = num_list[num_list.length-2];
        
        for(int i=0; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        if(endlist > endlistb){
            answer.add(endlist - endlistb);
        }else{
            answer.add(endlist * 2);
        }
        
        int [] result = new int[answer.size()];
        
        for(int i = 0; i<answer.size(); i++){
            result[i]= answer.get(i);
        }
        
        return result;

    }
}