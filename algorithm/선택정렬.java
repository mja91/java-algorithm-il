package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 선택정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            System.out.println();
        }

        int[] answers = solution(n, arr);
        for (int i=0; i<answers.length; i++) {
            System.out.print(answers[i]);
            if (i+1 != n) {
                System.out.print(" ");
            }
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i=0; i<n-1; i++) {
            int index = i;
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
