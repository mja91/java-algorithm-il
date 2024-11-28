package algorithm.recursive_tree_graph.bfs.섬나라_아일랜드;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    static class Point {
        private int x;
        private int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int answer = 0;
    static int n;
    static int[][] arr;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> Q = new LinkedList<>();

    static void bfs(int x, int y, int[][] arr) {
        Q.add(new Point(x, y));
        while (!Q.isEmpty()) {
            Point temp = Q.poll();
            for (int i=0; i<8; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    Q.add(new Point(nx, ny));
                }
            }
        }
    }

    static void solution(int[][] arr) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j] == 1) {
                    answer++;
                    arr[i][j] = 0;
                    bfs(i, j, arr);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);
    }
}