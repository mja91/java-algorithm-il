package algorithm.recursive_tree_graph.dfs.동전교환;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class 동전교환 {

    private static int n;
    private static int m;
    private static int answer = Integer.MAX_VALUE;

    public static void dfs(int l, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (l >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, l);
        } else {
            for (int i=0; i<n; i++) {
                dfs(l+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
