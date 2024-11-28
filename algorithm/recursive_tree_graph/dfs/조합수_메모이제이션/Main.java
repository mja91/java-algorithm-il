package algorithm.recursive_tree_graph.dfs.조합수_메모이제이션;

import java.util.Scanner;

public class Main {

    private static int[][] dy = new int[35][35];

    public static int dfs(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int answer = dfs(n, r);
        System.out.println(answer);
    }
}
