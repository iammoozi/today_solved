class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        int arrlength = arr.length;
        
        for(int i =0; i < arrlength; i++){
            answer += arr[i];
        }
        return answer;
    }
}