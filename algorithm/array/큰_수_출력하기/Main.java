package algorithm.array.큰_수_출력하기;

import java.util.*;

public class Main {

    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1; i<n; i++) {
            if (arr[i]>arr[i-1]) {
                answer.add(arr[i]);
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
