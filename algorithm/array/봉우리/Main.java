package algorithm.array.봉우리;

import java.util.*;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean isTop = true;
                for (int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    boolean isInside = nx>=0 && nx<n && ny>=0 && ny<n;
                    if (isInside && arr[nx][ny] >= arr[i][j]) {
                        isTop = false;
                        break;
                    }
                }
                if (isTop) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = solution(n, arr);
        System.out.println(answer);
    }
}
