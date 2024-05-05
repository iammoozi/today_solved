import static java.util.Arrays.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        long resultNumber = scanner.nextLong();
        long sum = 0;
        long plus = 1;
    
        while(true){
            sum += plus;
            if (resultNumber < sum ) break;
            plus++;
        }

        System.out.println(--plus);

    }

}