class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a)+String.valueOf(b);
        
        int ab2 = a * b * 2;
        
        if(Integer.parseInt(ab) >= ab2){
            return Integer.parseInt(ab);
        }
        else{
            return ab2;
        }
        
    }
}