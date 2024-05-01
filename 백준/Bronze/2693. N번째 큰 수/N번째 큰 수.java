
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tc = in.nextInt();
        
        int arr[] = new int[10];
        
        int num=0;
        for(int i=0;i<tc;i++){
            for(int j=0;j<10;j++){
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
            num=arr[7];
            System.out.println(num);
        }
        

    }
}