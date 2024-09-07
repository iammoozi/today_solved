import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(n != 1){
            int next = n % 2 == 0 ? n / 2 : n * 3 + 1;
            list.add(next);
            n = next;
        }
        return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
}