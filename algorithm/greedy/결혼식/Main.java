package algorithm.greedy.결혼식;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static class Time implements Comparable<Time> {
        private int time;
        private char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time ob) {
            if (this.time == ob.time) {
                return this.state - ob.state;
            } else {
                return this.time - ob.time;
            }
        }
    }

    static int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int count = 0;
        for (Time time : arr) {
            if (time.state == 's') {
                count++;
            } else {
                count--;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList arr = new ArrayList<Time>();
        for (int i=0; i<n; i++) {
            int sT = sc.nextInt();
            Time startTime = new Time(sT, 's');
            arr.add(startTime);

            int eT = sc.nextInt();
            Time endTime = new Time(eT, 'e');
            arr.add(endTime);
        }
        int answer = solution(arr);
        System.out.println(answer);
    }
}
