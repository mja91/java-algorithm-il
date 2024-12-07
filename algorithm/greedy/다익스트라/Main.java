package algorithm.greedy.다익스트라;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;

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

    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] distance;
    static void solution(int vex) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(vex, 0));
        distance[vex] = 0;

        while (!pQ.isEmpty()) {
            Edge temp = pQ.poll();
            int nowVex = temp.vex; // 현재 정점
            int nowCost = temp.cost; // 현재 최소 비용
            if (nowCost > distance[nowVex]) {
                continue;
            }

            for (Edge ob : graph.get(nowVex)) {
                if (distance[ob.vex] > nowCost + ob.cost) {
                    distance[ob.vex] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
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

        distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Edge edge = new Edge(b, c);
            graph.get(a).add(edge);
        }

        solution(1);

        for (int i=2; i<=n; i++) {
            if (distance[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + distance[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }
    }
}