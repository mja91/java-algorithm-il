package algorithm.twoPointers_slidingWindow.최대_길이_연속_부분_수열;

import java.util.*;

public class Main {

    static int solution(int n, int k, int[] arr) {
        int answer = 0, count = 0, lt = 0;
        for (int rt=0; rt<n; rt++) {
            if (arr[rt] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[lt] == 0) {
                    count--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = solution(n, k, arr);
        System.out.println(answer);
    }
}
