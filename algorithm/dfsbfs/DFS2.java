package algorithm.dfsbfs;

public class DFS2 {

    public void execute(int n) {
        if (n > 0) {
            execute(n / 2);
            System.out.println(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        DFS2 dfs2 = new DFS2();
        dfs2.execute(11);
    }
}
