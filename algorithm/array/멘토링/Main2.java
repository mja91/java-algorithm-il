package algorithm.array.멘토링;

import java.util.Scanner;

public class Main2 {

    static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        int[][] rank = new int[m][n+1]; // 학생의 등수는 1부터 시작해야함
        for (int k=0; k<m; k++) {
            for (int s=0; s<n; s++) { // 매 시험에 대한 학생별 등수 구하기
                rank[k][arr[k][s]] = s;
            }
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i == j) continue; // 자신에 대해선 확인 불필요

                int count = 0;

                for (int k=0; k<m; k++) { // 멘토(i), 멘티(j) 간 모든 시험에 대한 등수 비교
                    if (rank[k][i] < rank[k][j]) {
                        count++;
                    } else {
                        break;
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
