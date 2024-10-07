import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int max = nums.length / 2;
        
        Set<Integer> poket = new HashSet<>();
        
        for(int i : nums){
            poket.add(i);
        }
        
        return max < poket.size() ? max : poket.size();
        
    }
}