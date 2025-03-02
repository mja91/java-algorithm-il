package algorithm.string.단어_뒤집기;

import java.util.*;

public class Review {

    static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i=length-1; i>=0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            String input = sc.next();
            String answer = solution(input);
            System.out.println(answer);
        }
    }
}
