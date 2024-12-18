package algorithm.array.소수_에라토스테네스_체;

import java.util.*;

public class Main {

    static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i=2; i<=n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    arr[j] = 1;
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