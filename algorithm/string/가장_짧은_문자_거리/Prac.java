package algorithm.string.가장_짧은_문자_거리;

import java.util.*;

public class Prac {

    static void solution(String s, String t) {
        char[] arr = s.toCharArray();
        char c = t.charAt(0);
        int length = arr.length;
        for (int i=0; i<length; i++) {
            int lt = 0, rt = 0;

            for (int j=i; j<length; j++) { // -->
                if (arr[j] == c) {
                    break;
                }
                lt++;
            }

            for (int j=i; j>=0; j--) { // <--
                if (arr[j] == c) {
                    break;
                }
                rt++;
            }

            if (lt < rt) {
                System.out.print(lt);
            } else {
                System.out.print(rt);
            }
            if (i != length-1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        solution(s, t);
    }
}
