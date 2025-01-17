package algorithm.array.뒤집은_소수;

import java.util.*;

public class Main {

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int temp = arr[i];
            int revs = 0;
            while (temp > 0) {
                int x = temp % 10;    // 마지막 자리 구하기
                revs = revs * 10 + x; // 뒤집은 숫자에 마지막 자리 더하기
                temp = temp / 10;
            }
            if (isPrime(revs)) {
                answer.add(revs);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = solution(n, arr);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
