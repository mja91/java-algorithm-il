package algorithm.array.보이는_학생;

import java.util.*;

public class Main {

    static int solution(int n, int[] arr) {
        int answer = 1;
        int top = arr[0];
        for (int i=1; i<n; i++) {
            if (top < arr[i]) {
                top = arr[i];
                answer++;
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
