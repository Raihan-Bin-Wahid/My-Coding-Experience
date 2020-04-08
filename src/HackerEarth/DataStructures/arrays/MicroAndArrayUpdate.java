package HackerEarth.DataStructures.arrays;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class MicroAndArrayUpdate {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        while (testCase -- > 0){
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] arr = new int[N];
            int minimum = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
                if (minimum > arr[i])
                    minimum = arr[i];

            }

            if(minimum < K )
                System.out.println( K - minimum);
            else
                System.out.println(0);
        }
    }
}
