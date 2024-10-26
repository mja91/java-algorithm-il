package algorithm.sorting_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 좌표정렬 {

    public static class Point implements Comparable<Point> {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point point) {
            if (this.x == point.x) {
                return this.y - point.y;
            } else {
                return this.x - point.x;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
