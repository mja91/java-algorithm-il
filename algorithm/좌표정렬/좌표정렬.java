package algorithm.좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 좌표정렬 {

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
