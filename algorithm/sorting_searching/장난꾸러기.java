package algorithm.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 장난꾸러기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        String answer = solution(n, arr);
        System.out.println(answer);
    }

    private static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        int[] temp = arr.clone();
        Arrays.sort(temp);

        for (int i=0; i<n; i++) {
            if (arr[i] != temp[i]) {
                sb.append(i + 1 + " ");
            }
        }

        return sb.substring(0, sb.length()-1);
    }
}
