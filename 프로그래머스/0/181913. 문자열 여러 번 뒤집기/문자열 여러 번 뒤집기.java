class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int[] query : queries){
            int s = query[0];
            int e = query[1];
            
            // 문자열의 앞부분을 자릅니다.
            String front = my_string.substring(0, s);

            // 뒤집을 부분 문자열을 생성합니다.
            StringBuilder reverseStr = new StringBuilder();
            for (int i = e; i >= s; i--) {
                reverseStr.append(my_string.charAt(i));
            }

            // 문자열의 뒷부분을 자릅니다.
            String back = my_string.substring(e + 1);

            // 새로운 문자열을 생성합니다.
            my_string = front + reverseStr.toString() + back;
            
        }
        
        
        
        return my_string;
    }
}