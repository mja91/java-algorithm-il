package algorithm.dfs;

public class 피보나치수열_메모이제이션 {

    static int[] arr;

    public static int dfs(int n) {
        if (arr[n] > 0) {
            return arr[n];
        }

        if (n <= 2) {
            return arr[n] = 1;
        } else {
            return arr[n] = dfs(n-2) + dfs(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 45;
        arr = new int[n+1];
        dfs(n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
