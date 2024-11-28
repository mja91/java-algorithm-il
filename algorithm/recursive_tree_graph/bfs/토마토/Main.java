package algorithm.recursive_tree_graph.bfs.토마토;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    static class Point {
        private int x;
        private int y;
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;
    static int[][] board, dis;
    static Queue<Point> Q = new LinkedList<>();
    static void bfs () {
        while (!Q.isEmpty()) {
            Point temp = Q.poll();
            for (int i=0; i<4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    Q.offer(new Point(i, j));
                }
            }
        }

        bfs();

        int answer = Integer.MIN_VALUE;
        boolean flag = true;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
        } else {
            answer = -1;
        }
        System.out.println(answer);
    }
}
