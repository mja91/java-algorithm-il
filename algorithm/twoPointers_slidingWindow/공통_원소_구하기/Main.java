package algorithm.twoPointers_slidingWindow.공통_원소_구하기;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<Integer> list;

    static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1<n && p2<m) {
            if (arr1[p1] == arr2[p2]) {
                list.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        list = solution(n, m, arr1, arr2);
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }
}