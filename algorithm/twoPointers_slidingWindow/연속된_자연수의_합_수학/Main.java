package algorithm.twoPointers_slidingWindow.연속된_자연수의_합_수학;

import java.util.*;

public class Main {

    static int solution(int n) {
        int answer = 0, count = 1;
        n--;
        while (n > 0) {
            count++;
            n = n - count;
            if (n % count == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }
}
