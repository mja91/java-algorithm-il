package algorithm.string.유효한_팰린드롬;

import java.util.*;

public class Main {

    static final String YES = "YES";
    static final String NO = "NO";

    static String solution(String input) {
        char[] arr = input.toCharArray();
        int lt = 0, rt = arr.length-1;
        while (lt<rt) {
            char lc = arr[lt];
            char rc = arr[rt];
            if (Character.isAlphabetic(lc) && Character.isAlphabetic(rc)) {
                if (!String.valueOf(lc).equalsIgnoreCase(String.valueOf(rc))) {
                    return NO;
                }
            }
            lt++;
            rt--;
        }
        return YES;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = solution(input);
        System.out.println(answer);
    }
}