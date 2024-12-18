package algorithm.array.피보나치수열;

import java.util.*;

public class Main {

    static void solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i=3; i<n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}