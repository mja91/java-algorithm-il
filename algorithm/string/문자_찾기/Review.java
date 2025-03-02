package algorithm.string.문자_찾기;

import java.util.*;

public class Review {

    static int solution(char[] arr, char c) {
        int answer = 0;
        for (char x : arr) {
            if (x == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toLowerCase().toCharArray();
        char c = sc.next().charAt(0);
        int answer = solution(arr, c);
        System.out.println(answer);
    }
}
