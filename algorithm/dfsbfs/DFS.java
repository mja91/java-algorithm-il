package algorithm.dfsbfs;

public class DFS {

    public void dfs(int n) {
        if (n > 0) {
            dfs(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.dfs(3);
    }
}
