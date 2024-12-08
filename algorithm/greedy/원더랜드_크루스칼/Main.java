package algorithm.greedy.원더랜드_크루스칼;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int[] unf;

    static class Edge implements Comparable<Edge> {
        private int v1;
        private int v2;
        private int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;
        }
    }

    static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        for (int i=0; i<=n; i++) {
            unf[i] = i;
        }

        ArrayList<Edge> arr = new ArrayList<>();
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge(a, b, c));
        }

        int answer = 0;
        Collections.sort(arr);
        for (Edge ob : arr) {
            int count = 0;
            int fv1 = find(ob.v1);
            int fv2 = find(ob.v2);
            if (fv1 != fv2) {
                answer += ob.cost;
                union(ob.v1, ob.v2);
                count++;
                if (count >= n-1) {
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
