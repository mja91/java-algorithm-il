package algorithm.string.암호;

import java.util.*;

public class Main {

    static String solution(int n, String input) {
        String answer = "";
        for (int i=0; i<n; i++) {
            String temp = input.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(temp, 2);
            answer += (char) num;
            input = input.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();
        String answer = solution(n, input);
        System.out.println(answer);
    }
}