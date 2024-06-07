package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 모든아나그램찾기 {

    /**
     * bacaAacba
     * abc
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int result = solution(s, t);
        System.out.println(result);
    }

    private static int solution(String s, String t) {
        int result = 0;
        HashMap<Character, Integer> thm = new HashMap<>();
        for (int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            thm.put(c, thm.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> shm = new HashMap<>();
        for (int i=0; i<t.length() - 1; i++) {
            char c = s.charAt(i);
            shm.put(c, shm.getOrDefault(c, 0) + 1);
        }

        int lt = 0;
        for (int rt=t.length() - 1; rt<s.length(); rt++) {
            char c = s.charAt(rt);
            shm.put(c, shm.getOrDefault(c, 0) + 1);
            if (thm.equals(shm)) {
                result++;
            }

            char b = s.charAt(lt);
            shm.put(b, shm.get(b) - 1);
            if (shm.get(b) == 0) {
                shm.remove(b);
            }
            lt++;
        }

        return result;
    }
}
