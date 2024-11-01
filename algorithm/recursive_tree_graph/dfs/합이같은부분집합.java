package algorithm.recursive_tree_graph.dfs;

import java.util.Scanner;

public class 합이같은부분집합 {

    static String answer = "NO";
    static int n = 0;
    static int total = 0;
    static boolean flag = false;

    public static void dfs(int l, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (sum > total/2) {
            return;
        }
        if (l == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(l+1, sum+arr[l], arr);
            dfs(l+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
