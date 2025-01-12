package algorithm.string.단어_뒤집기;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.next(); // 전체 단어 arr 담기
        }

        for (String x : arr) {
            StringBuilder sb = new StringBuilder();
            char[] ca = x.toCharArray(); // 해당 순서 단어 쪼개기
            for (int i=ca.length-1; i>=0; i--) { // 맨 뒤 문자열부터 더하기
                sb.append(ca[i]);
            }
            System.out.println(sb);
        }
    }
}
