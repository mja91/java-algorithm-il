package algorithm.dfsbfs;

public class DFS {

    public void execute(int n) {
        if (n > 0) {
            execute(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.execute(3);
    }
}
