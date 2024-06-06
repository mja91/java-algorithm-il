package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 학급회장 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String text = br.readLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            char c = text.charAt(i);
            Integer count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        String result = null;
        int maxCount = 0;
        for (int j=0; j<n; j++) {
            char c = text.charAt(j);
            Integer count = map.get(c);
            if (maxCount < count) {
                maxCount = count;
                result = String.valueOf(c);
            }
        }

        System.out.println(result);
    }
}
