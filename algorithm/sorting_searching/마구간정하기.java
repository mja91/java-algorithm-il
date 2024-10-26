package algorithm.sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {

    // 결정알고리즘(이분 탐색)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, c, arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 1;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (getCount(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private static int getCount(int[] arr, int mid) {
        int count = 1;
        int ep = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] - ep >= mid) {
                count++;
                ep = arr[i];
            }
        }
        return count;
    }
}
