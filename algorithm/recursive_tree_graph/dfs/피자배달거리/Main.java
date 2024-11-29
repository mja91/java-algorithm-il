package algorithm.recursive_tree_graph.dfs.피자배달거리;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static class Point {
        private int x;
        private int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> home, pizza;

    static void dfs(int l, int s) {
        if (l == m) {
            int sum = 0;
            for (Point h : home) { // 도시의 피자 배달 거리 구하기
                int distance = Integer.MAX_VALUE;
                for (int i : combi) {
                    distance = Math.min(distance, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i=s; i<len; i++) { // 0~5개 중 조합할 피자 추출
                combi[l] = i;
                dfs(l+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    home.add(new Point(i, j));
                } else if (temp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        len = pizza.size();
        combi = new int[m];
        dfs(0, 0);
        System.out.println(answer);
    }
}
