import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            
            else if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
            }
            
        }
        
        int[] result = new int [stack.size()];
        
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
              
         return result;
        
    }
}
