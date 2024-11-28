package algorithm.recursive_tree_graph.dfs.최대점수_구하기;

import java.util.Scanner;

public class Main {

    private static int answer = Integer.MIN_VALUE;
    private static int n;
    private static int m;

    public static void dfs(int l, int sum, int time, int[] ps, int[] pm) {
        if (time > m) {
            return;
        }
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(l+1, sum+ps[l], time+pm[l], ps, pm);
            dfs(l+1, sum, time, ps, pm);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] ps = new int[n];
        int[] pm = new int[n];
        for (int i=0; i<n; i++) {
            ps[i] = sc.nextInt();
            pm[i] = sc.nextInt();
        }
        dfs(0, 0, 0, ps, pm);
        System.out.println(answer);
    }
}
