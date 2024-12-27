package algorithm.string.중복_문자_제거;

import java.util.*;

public class Main {

    static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        char[] arr = input.toCharArray();
        ArrayList<Character> check = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            char temp = arr[i];
            if (!check.contains(temp)) {
                check.add(temp);
                answer.append(temp);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = solution(input);
        System.out.println(answer);
    }
}