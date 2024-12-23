package algorithm.string.단어_뒤집기;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        for (String x : arr) {
            StringBuilder sb = new StringBuilder();
            char[] ca = x.toCharArray();
            for (int i=ca.length-1; i>=0; i--) {
                sb.append(ca[i]);
            }
            System.out.println(sb);
        }
    }
}
