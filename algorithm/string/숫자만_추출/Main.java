package algorithm.string.숫자만_추출;

import java.util.*;

public class Main {

    static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        char[] arr = input.toCharArray();
        for (char x : arr) {
            if (Character.isDigit(x)) {
                answer.append(x);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = solution(input);
        System.out.println(Long.parseLong(answer));
    }
}