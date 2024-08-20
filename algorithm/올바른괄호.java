package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        solution(input);
    }

    private static void solution(char[] input) {
        Stack stack = new Stack();
        for (char c : input) {
            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}