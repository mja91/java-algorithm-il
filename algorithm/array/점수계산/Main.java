package algorithm.array.점수계산;

import java.util.*;

public class Main {

    static int solution(int n, int[] arr) {
        int answer = 0, count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = solution(n, arr);
        System.out.println(answer);
    }
}
