package algorithm.greedy.최대_강연료;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {

    static int n, max = Integer.MIN_VALUE;

    static class Lecture implements Comparable<Lecture> {
        private int money;
        private int date;
        public Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture lecture) {
            return lecture.date - this.date;
        }
    }

    static int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i=max; i>=1; i--) { // max 날짜부터 확인
            for (; j<n; j++) { // 각 i 날짜 중 일치하는 날짜의 강연료 저장
                if (arr.get(j).date < i) {
                    break;
                }
                pq.offer(arr.get(j).money);
            }
            if (!pq.isEmpty()) { // i 날짜 중 가장 큰 강연료 더하기
                answer += pq.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int money = sc.nextInt();
            int date = sc.nextInt();
            Lecture lecture = new Lecture(money, date);
            arr.add(lecture);
            max = Math.max(max, date);
        }
        int answer = solution(arr);
        System.out.println(answer);
    }
}
