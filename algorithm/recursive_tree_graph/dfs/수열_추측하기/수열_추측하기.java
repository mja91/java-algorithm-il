package algorithm.recursive_tree_graph.dfs.수열_추측하기;

import java.util.Scanner;

public class 수열_추측하기 {

    private static int[] b, p, check;
    private static int n, f;
    private static boolean flag = false;
    private static int[][] dy = new int[35][35];

    public static int combi(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }
    }

    public static void dfs(int l, int sum) {
        if (flag) { // 이미 수열을 구한 경우
            return;
        }
        if (l == n) { // 레벨이 숫자 개수와 같을 때
            if (f == sum) { // 마지막 값과 총합이 같을 때
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else { // 최상단 숫자가 몇번 사용되었는지 계산
            for (int i=1; i<=n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    p[l] = i;
                    dfs(l+1, sum+(p[l]*b[l]));
                    check[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n]; // 최상단 수열
        p = new int[n]; // 각 수열의 숫자들 곱해진 횟수
        check = new int[n+1];
        for (int i=0; i<n; i++) {
            b[i] = combi(n-1, i);
        }
        dfs(0, 0);
    }
}
