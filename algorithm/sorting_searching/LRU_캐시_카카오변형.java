package algorithm.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LRU_캐시_카카오변형 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");
        int size = Integer.parseInt(input1[0]);
        int n = Integer.parseInt(input1[1]);

        String[] input2 = br.readLine().split(" ");
        int[] arr = new int[input2.length];
        for (int i=0; i< arr.length; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        int[] answers = solution(size, n, arr);
        for (int i=0; i<answers.length; i++) {
            System.out.print(answers[i]);
            int length = answers.length;
            if (length != i+1) {
                System.out.print(" ");
            }
        }
    }

    private static int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i=0; i<size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }

            if (pos == -1) {
                for (int i=size-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for (int i=pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }
}
