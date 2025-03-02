package algorithm.string.대소문자_변환;

import java.util.*;

public class Review {

    static String solution(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c >= 97 && c <= 122) {
                sb.append((char) (c-32));
            } else {
                sb.append((char) (c+32));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String answer = solution(arr);
        System.out.println(answer);
    }
}
