package algorithm.recursive_tree_graph.bfs;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class 송아지찾기 {

    static int[] dis = {1, -1, 5};
    static int[] check;
    static Queue<Integer> queue = new LinkedList<>();

    public static int solution(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        queue.offer(s);
        int l = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                int x = queue.poll();
                for (int j=0; j<dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == e) {
                        return l + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            l++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int result = solution(s, e);
        System.out.println(result);
    }
}