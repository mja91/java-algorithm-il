package algorithm.recursive_tree_graph;

public class 팩토리얼_DFS {

    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(dfs(7));
    }
}
