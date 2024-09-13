package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 중복확인 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = getNums(br.readLine());
        String answer = solution(n, arr);
        System.out.println(answer);
    }

    private static int[] getNums(String str) {
        String[] tempArr = str.split(" ");
        int length = tempArr.length;
        int[] arr = new int[length];
        for (int i=0; i<length; i++) {
            arr[i] = Integer.parseInt(tempArr[i]);
        }
        return arr;
    }

    private static String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) {
                return "D";
            }
        }
        return answer;
    }
}
