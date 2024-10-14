import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        
        Arrays.sort(arr);
        
        if(arr[0] == arr[3]){
            return 1111 * arr[0];
        }
        else if(arr[0] == arr[2] || arr[1] == arr[3]){
            int p = arr[2]; // 무조건 중복수
            int q = arr[3] + arr[0] - arr[2]; // 중복되지 않은 수
            return (10 * p + q) * (10 * p + q);
        }
        
        else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            return (arr[0] + arr[2]) * (arr[2] - arr[0]);  
        }         
        else if (arr[0] == arr[1]) {
            return arr[2] * arr[3];  // 두 다른 숫자의 곱을 반환
        }
        else if (arr[1] == arr[2]) {
            return arr[0] * arr[3];  // 두 다른 숫자의 곱을 반환
        }
        else if (arr[2] == arr[3]) {
            return arr[0] * arr[1];  // 두 다른 숫자의 곱을 반환
        }
        else {
            return arr[0];  // 가장 작은 숫자를 반환
        }
        
        
    }
}