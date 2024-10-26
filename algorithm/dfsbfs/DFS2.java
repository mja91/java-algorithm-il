package algorithm.dfsbfs;

public class DFS2 {

    public void dfs(int n) {
        if (n > 0) {
            dfs(n / 2);
            System.out.println(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        DFS2 dfs2 = new DFS2();
        dfs2.dfs(11);
    }
}
