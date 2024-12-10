package algorithm.twoPointers_slidingWindow.연속된_자연수의_합_투포인터;

import java.util.*;

public class Main {

    static int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i=0; i<m; i++) {
            arr[i] = i + 1;
        }
        for (int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }
}
