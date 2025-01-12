package algorithm.string.대소문자_변환;

import java.util.*;

public class Main {

    static String solution(String input) {
        String answer = "";
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (c >= 97 && c <= 122) { // 97 ~ 122 : 소문자, 소문자 ASCII Code - 32 : 대문자
                answer += (char)(c-32);
            } else {
                answer += (char)(c+32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String answer = solution(input);
        System.out.println(answer);
    }
}
