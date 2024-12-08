package algorithm.twoPointers_slidingWindow.두_배열_합치기;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> list;

    static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1<n && p2<m) {
            if (arr1[p1] < arr2[p2]) {
                list.add(arr1[p1++]);
            } else {
                list.add(arr2[p2++]);
            }
        }
        while (p1<n) {
            list.add(arr1[p1++]);
        }
        while (p2<m) {
            list.add(arr2[p2++]);
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