package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {

    // 결정 알고리즘(이분 탐색)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (getCount(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    private static int getCount(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return count;
    }
}
