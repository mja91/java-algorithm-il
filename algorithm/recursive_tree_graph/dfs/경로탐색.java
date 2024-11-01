package algorithm.recursive_tree_graph.dfs;

import java.util.Scanner;

public class 경로탐색 {

    static int n;
    static int m;
    static int answer = 0;
    static int[][] graph;
    static int[] check;

    /**
     * 인접 행렬 탐색
     * @param v 기점
     */
    public static void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i=1; i<=n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][m+1];
        check = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}
