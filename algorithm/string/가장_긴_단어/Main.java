package algorithm.string.가장_긴_단어;

import java.util.*;

public class Main {

    static String solution(String input) {
        String answer = "";
        int top = Integer.MIN_VALUE;
        for (String x : input.split(" ")) {
            int temp = x.length();
            if (temp > top) {
                answer = x;
                top = temp;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = solution(input);
        System.out.println(answer);
    }
}