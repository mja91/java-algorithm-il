package algorithm.dfsbfs;

public class 팩토리얼 {

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
