package algorithm.string.문자열_압축;

import java.util.*;

public class Review {

    static String solution(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int length = arr.length;
        for (int i=0; i<length; i++) {
            char currentChar = arr[i];
            int count = 1;
            while (i+1 < length && arr[i+1] == currentChar) {
                count++;
                i++;
            }
            sb.append(currentChar);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String answer = solution(arr);
        System.out.println(answer);
    }
}
