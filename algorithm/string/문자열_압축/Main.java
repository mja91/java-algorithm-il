package algorithm.string.문자열_압축;

import java.util.*;

public class Main {

    static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        int length = input.length();
        int i = 0;
        while (i < length) {
            char currentChar = input.charAt(i);
            int count = 1;
            while (i+1 < length && input.charAt(i+1) == currentChar) {
                count++;
                i++;
            }
            answer.append(currentChar);
            if (count > 1) {
                answer.append(count);
            }
            i++; // 다음 문자열 이동
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = solution(input);
        System.out.println(answer);
    }
}