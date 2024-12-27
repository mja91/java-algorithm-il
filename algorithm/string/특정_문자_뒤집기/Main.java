package algorithm.string.특정_문자_뒤집기;

import java.util.*;

public class Main {

    static String solution(String input) {
        String answer = "";
        char[] arr = input.toCharArray();
        int lt = 0, rt = arr.length-1;
        while (lt<rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = solution(input);
        System.out.println(answer);
    }
}