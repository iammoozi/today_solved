class Solution {
    public int solution(int n, String control) {
        int answer;
        
        String[] control_list = control.split("");
        
        for(int i = 0; i <control_list.length; i++ ){
            if(control_list[i].equals("w")){
                n += 1;
            }
            else if(control_list[i].equals("s")){
                n -= 1;
            }
            else if(control_list[i].equals("d")){
                n += 10;
            }
            else if(control_list[i].equals("a")){
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}