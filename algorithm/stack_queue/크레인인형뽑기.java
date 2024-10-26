package algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 크레인인형뽑기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        for (int i=0; i<m; i++) {
            moves[i] = Integer.parseInt(br.readLine());
        }

        int answer = solution(board, moves);
        System.out.println(answer);
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i=0; i<board.length; i++) {
                if (board[i][pos-1] != 0) {
                    int temp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
