class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int blength = included.length;
        
        for(int i = 0; i <blength; i++){
            if(included[i]){
                answer += a + d * i;
            }
        }
        
        return answer;
    }
}