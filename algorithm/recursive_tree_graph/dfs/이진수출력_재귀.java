package algorithm.recursive_tree_graph.dfs;

public class 이진수출력_재귀 {

    public void dfs(int n) {
        if (n > 0) {
            dfs(n / 2);
            System.out.println(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        이진수출력_재귀 dfs2 = new 이진수출력_재귀();
        dfs2.dfs(11);
    }
}
