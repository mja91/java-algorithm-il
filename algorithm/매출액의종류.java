package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 매출액의종류 {

    /**
     * 7 4
     * 20 12 20 10 23 17 10
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        String[] sales = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(sales[i]);
        }

        String result = solution(n, k, arr);
        System.out.println(result);
    }

    private static String solution(int n, int k, int[] arr) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt=k-1; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            sb.append(map.size()).append(" ");
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.getOrDefault(arr[lt], 0) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return sb.toString().trim();
    }
}