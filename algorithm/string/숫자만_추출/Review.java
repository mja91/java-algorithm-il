package algorithm.string.숫자만_추출;

import java.util.*;

public class Review {

    static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String answer = solution(input);
        System.out.println(Integer.parseInt(answer));
    }
}
