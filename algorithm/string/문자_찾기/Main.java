package algorithm.string.문자_찾기;

import java.util.*;

public class Main {

    static int solution(String[] arr, String c) {
        int answer = 0;
        for (String x : arr) {
            if (x.equalsIgnoreCase(c)) { // 대소문자 미구분 시 String의 .equalsIgnoreCase() 활용
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        String c = sc.nextLine();

        int answer = solution(arr, c);
        System.out.println(answer);
    }
}