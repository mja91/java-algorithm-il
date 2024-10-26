package algorithm.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 버블정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int[] answers = solution(n, arr);
        for (int i=0; i<answers.length; i++) {
            System.out.print(answers[i]);
            if (i != answers.length-1) {
                System.out.print(" ");
            }
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
