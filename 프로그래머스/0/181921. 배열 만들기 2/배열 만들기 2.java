import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            if(isResult(i)){
               list.add(i); 
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        int[] answer = new int [list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public boolean isResult(int num){
        while (num > 0){
            int digit = num % 10;
            
            if(digit != 0 && digit != 5){
                return false;
            }
            num /= 10;
        }
        return true; // 모든 자릿수가 0이나 5인 경우 true

    }
}