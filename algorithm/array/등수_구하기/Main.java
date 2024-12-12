package algorithm.array.등수_구하기;

import java.util.*;

public class Main {

    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            int count = 1;
            for (int j=0; j<n; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            answer[i] = count;
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
        int[] answer = solution(n, arr);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
