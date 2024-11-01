package algorithm.recursive_tree_graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리 {

    static int n;
    static int m;
    static int[] distance;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    /**
     * 인접 행렬 탐색
     * @param v 기점
     */
    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        distance[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    queue.offer(nv);
                    distance[nv] = distance[cv] + 1;
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
        distance = new int[n+1];
        check = new int[n+1];
        check[1] = 1;
        bfs(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
