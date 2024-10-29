package algorithm.recursive_tree_graph;

public class 재귀함수_스택프레임_DFS {

    public void dfs(int n) {
        if (n > 0) {
            dfs(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        재귀함수_스택프레임_DFS dfs = new 재귀함수_스택프레임_DFS();
        dfs.dfs(3);
    }
}
