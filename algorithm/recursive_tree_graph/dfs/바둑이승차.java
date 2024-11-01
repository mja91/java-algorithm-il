package algorithm.recursive_tree_graph.dfs;

import java.util.Scanner;

public class 바둑이승차 {

    static int c;
    static int n;
    static int answer = Integer.MIN_VALUE;

    public static void dfs(int l, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(l+1, sum+arr[l], arr);
            dfs(l+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
