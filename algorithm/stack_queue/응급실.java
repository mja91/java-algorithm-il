package algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 응급실 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        String[] strArr = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int answer = solution(n, m, arr);
        System.out.println(answer);
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person temp = Q.poll();
            for (Person x : Q) {
                if (x.getPriority() > temp.getPriority()) {
                    Q.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if (temp.getId() == m) {
                    return answer;
                }
            }
        }
        return answer;
    }
}

class Person {
    private int id;
    private int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }
    public int getPriority() {
        return priority;
    }
}
