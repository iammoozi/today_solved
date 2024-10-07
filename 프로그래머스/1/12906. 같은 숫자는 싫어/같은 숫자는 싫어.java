import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                q.offer(arr[i]);
            }
        }

        // 큐를 배열로 변환
        int[] answer = new int[q.size()];
        int index = 0;
        while(!q.isEmpty()) {
            answer[index++] = q.poll();
        }
        
        return answer; 
    }
}
