package algorithm.array.가위바위보;

import java.util.*;

public class Main {

    static final Integer SCISSORS = 1;
    static final Integer ROCK = 2;
    static final Integer PAPER = 3;

    static String[] solution(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            if (arrA[i] == SCISSORS && arrB[i] == ROCK) {
                answer[i] = "B";
            } else if (arrA[i] == SCISSORS && arrB[i] == PAPER) {
                answer[i] = "A";
            } else if (arrA[i] == ROCK && arrB[i] == SCISSORS) {
                answer[i] = "A";
            } else if (arrA[i] == ROCK && arrB[i] == PAPER) {
                answer[i] = "B";
            } else if (arrA[i] == PAPER && arrB[i] == SCISSORS) {
                answer[i] = "B";
            } else if (arrA[i] == PAPER && arrB[i] == ROCK) {
                answer[i] = "A";
            } else {
                answer[i] = "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i=0; i<n; i++) {
            arrA[i] = sc.nextInt();
        }
        int[] arrB = new int[n];
        for (int i=0; i<n; i++) {
            arrB[i] = sc.nextInt();
        }
        String[] answer = solution(n, arrA, arrB);
        for (String x : answer) {
            System.out.println(x);
        }
    }
}
