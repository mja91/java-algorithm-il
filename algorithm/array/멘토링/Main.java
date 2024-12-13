package algorithm.array.멘토링;

import java.util.*;

public class Main {

    static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i=1; i<=n; i++) { // 멘토
            for (int j=1; j<=n; j++) { // 멘티
                int count = 0;
                for (int k=0; k<m; k++) { // k번의 시험 중 멘토가 멘티 보다 모두 앞서는지 확인
                    int pi = 0, pj = 0;
                    for (int s=0; s<n; s++) {
                        if (arr[k][s] == i) { // 각 시험별 멘토 등수 확인
                            pi = s;
                        }
                        if (arr[k][s] == j) { // 각 시험별 멘티 등수 확인
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        count++;
                    }
                }
                if (count == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = solution(n, m, arr);
        System.out.println(answer);
    }
}
