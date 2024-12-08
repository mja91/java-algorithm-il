package algorithm.greedy.원더랜드_프림;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {

    static class Edge implements Comparable<Edge> {
        private int vex;
        private int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] check = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }

        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()) {
            Edge temp = pQ.poll();
            int ev = temp.vex;
            if (check[ev] == 0) {
                check[ev] = 1;
                answer += temp.cost;
                for (Edge ob : graph.get(ev)) {
                    if (check[ob.vex] == 0) {
                        pQ.offer(new Edge(ob.vex, ob.cost));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
