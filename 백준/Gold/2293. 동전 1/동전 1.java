import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    static int n,k;
    static int [] arr,dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
 
        arr = new int[n+1];
        dp = new int[k+1];
 
 
        for(int i=1; i<=n; i++){
            String s1 = br.readLine();
            arr[i] = Integer.parseInt(s1);
        }
 
        dp[0]=1;
 
 
        for(int i=1; i<=n; i++){
            for(int j=arr[i]; j<=k; j++){
                dp[j] += dp[j-arr[i]];
            }
        }
 
        System.out.println(dp[k]);
    }
}