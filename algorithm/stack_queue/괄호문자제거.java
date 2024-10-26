package algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        Stack stack = solution(input);

        String result = "";
        for (int i=0; i<stack.size(); i++) {
            result += stack.get(i);
        }

        System.out.println(result);
    }

    private static Stack solution(char[] input) {
        Stack<Character> stack = new Stack<>();
        for (char x : input) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        return stack;
    }
}