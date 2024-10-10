import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int result = 0;
        
        // 우선순위 배열을 복사하고 정렬하여 가장 높은 우선순위를 알 수 있게 함
        int[] sortedArray = priorities.clone();
        Arrays.sort(sortedArray);
        
        Queue<Integer> queue = new LinkedList<>();
        for(int n : priorities){
            queue.add(n);
        }
        
        int point = priorities.length - 1;
        int targetIndex = location;
        
        while(true){
            if(sortedArray[point] == queue.peek()){
                queue.poll();
                result++;
                point--;
                
                if(targetIndex == 0){
                    return result;
                }
            }else{
                queue.offer(queue.poll());
            }
            
            targetIndex = targetIndex - 1 >= 0 ? targetIndex - 1 : queue.size() - 1 ;
            
        }
        
    }
}