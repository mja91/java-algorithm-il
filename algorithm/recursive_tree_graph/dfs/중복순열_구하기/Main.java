package algorithm.recursive_tree_graph.dfs.중복순열_구하기;

import java.util.Scanner;

public class Main {

    private static int[] pm;
    private static int n;
    private static int m;

    public static void dfs(int l) {
        if (l == m) {
            for (int x : pm) {
                System.out.print(x+" ");
            }
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                pm[l] = i;
                dfs(l+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        dfs(0);
    }
}
