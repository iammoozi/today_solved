import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i =0; i < progresses.length; i++){
            int remainingDays = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                remainingDays++;
            }
            queue.offer(remainingDays);
        }
        
        List<Integer> result = new ArrayList<>();
        
        int front = queue.poll();
        int count = 1;
        
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current <= front){
                count++;
            }
            else{
                result.add(count);
                front = current;
                count = 1;
            }
        }   
        
        result.add(count);
        
        
        return result.stream().mapToInt(i->i).toArray();
    }
}