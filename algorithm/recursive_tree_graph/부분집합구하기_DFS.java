package algorithm.recursive_tree_graph;

public class 부분집합구하기_DFS {
    static int n;
    static int[] check;

    public static void dfs(int l) {
        if (l == n+1) {
            String temp = "";
            for (int i=1; i<=n; i++) {
                if (check[i] == 1) {
                    temp += i + " ";
                }
            }
            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            check[l] = 1;
            dfs(l+1);
            check[l] = 0;
            dfs(l+1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        check = new int[n+1];
        dfs(1);
    }
}
