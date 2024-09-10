package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삽입정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        int length1 = input.length;
        for (int i=0; i<length1; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] answers = solution(n, arr);
        int length2 = answers.length;
        for (int i=0; i<length2; i++) {
            System.out.print(answers[i]);
            if (i != n-1) {
                System.out.print(" ");
            }
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i=1; i<n; i++) {
            int temp = arr[i];
            int j;
            for (j=i-1; j>=0; j--) {
                if (arr[j]>temp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
