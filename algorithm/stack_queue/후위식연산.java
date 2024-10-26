package algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위식연산 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int answer = solution(input);
        System.out.println(answer);
    }

    private static int solution(char[] input) {
        Stack<Integer> stack = new Stack<>();
        for (char x : input) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        return stack.get(0);
    }
}