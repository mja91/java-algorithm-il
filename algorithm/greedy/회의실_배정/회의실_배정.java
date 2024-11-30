package algorithm.greedy.회의실_배정;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class 회의실_배정 {

    static class Time implements Comparable<Time> {
        private int s;
        private int e;

        public Time(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Time o) {
            if (this.e == o.e) {
                return this.s - o.s;
            } else {
                return this.e - o.e;
            }
        }
    }

    static int solution(ArrayList<Time> arr) {
        int count = 0;
        Collections.sort(arr);
        int et = 0;
        for (Time time : arr) {
            if (time.s >= et) {
                count++;
                et = time.e;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            Time time = new Time(s, e);
            arr.add(time);
        }

        int answer = solution(arr);
        System.out.println(answer);
    }
}
