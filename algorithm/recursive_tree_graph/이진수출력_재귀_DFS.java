package algorithm.recursive_tree_graph;

public class 이진수출력_재귀_DFS {

    public void dfs(int n) {
        if (n > 0) {
            dfs(n / 2);
            System.out.println(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        이진수출력_재귀_DFS dfs2 = new 이진수출력_재귀_DFS();
        dfs2.dfs(11);
    }
}
