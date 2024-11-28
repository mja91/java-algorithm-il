package algorithm.recursive_tree_graph.dfs.순열_구하기;

import java.util.Scanner;

public class Main {

    private static int n, m;
    private static int[] pm, arr, check;

    public static void dfs(int l) {
        if (l == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i=0; i<n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[l] = arr[i];
                    dfs(l+1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        check = new int[n];
        pm = new int[m];
        dfs(0);
    }
}
