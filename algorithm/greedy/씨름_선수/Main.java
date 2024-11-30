package algorithm.greedy.씨름_선수;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static class Body implements Comparable<Body> {
        private int h;
        private int w;

        public Body(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }

    static int solution(ArrayList<Body> arr) {
        int count = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body body : arr) {
            if (body.w > max) {
                max = body.w;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Body> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int tempH = sc.nextInt();
            int tempW = sc.nextInt();
            Body body = new Body(tempH, tempW);
            arr.add(body);
        }
        int answer = solution(arr);
        System.out.println(answer);
    }
}
