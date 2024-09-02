package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String required = br.readLine();
        String all = br.readLine();
        String answer = solution(required, all);
        System.out.println(answer);
    }

    private static String solution(String required, String all) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (int i=0; i<required.length(); i++) {
            Q.offer(required.charAt(i));
        }

        for (int i=0; i<all.length(); i++) {
            char x = all.charAt(i);
            if (Q.contains(x)) {
                char y = Q.poll();
                if (x != y) {
                    return "NO";
                }
            }
        }

        if (!Q.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }
}