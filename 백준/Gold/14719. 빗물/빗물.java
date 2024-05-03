import static java.util.Arrays.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    static int h,w;
    static int[] height;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        h = scanner.nextInt();
        w = scanner.nextInt();
        height = new int[w];

        for (int i = 0; i < w; i++) {
            height[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < w-1; i++) {
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left = Math.max(height[j],left);
            }

            for(int j=i+1; j<w; j++) {
                right = Math.max(height[j],right);
            }

            if (height[i] < left && height[i] < right) {
                result += Math.min(left,right) - height[i];
            }

        }

        System.out.println(result);
    }

}