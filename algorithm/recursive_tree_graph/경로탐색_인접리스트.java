package algorithm.recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {

    static int n;
    static int m;
    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    /**
     * 인접 행렬 탐색
     * @param v 기점
     */
    public static void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (check[nv] != 1) {
                    check[nv] = 1;
                    dfs(nv);
                    check[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check = new int[n+1];
        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}
