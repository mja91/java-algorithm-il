package algorithm.hashMap_treeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 아나그램 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text1 = br.readLine();
        Map<String, Integer> map1 = new HashMap<>();
        for (int i=0; i<text1.length(); i++) {
            char c = text1.charAt(i);
            int count = map1.getOrDefault(String.valueOf(c), 0);
            map1.put(String.valueOf(c), count + 1);
        }

        String text2 = br.readLine();
        Map<String, Integer> map2 = new HashMap<>();
        for (int j=0; j<text2.length(); j++) {
            char c = text2.charAt(j);
            int count = map2.getOrDefault(String.valueOf(c), 0);
            map2.put(String.valueOf(c), count + 1);
        }

        boolean result = true;
        for (int k=0; k<text1.length(); k++) {
            char c = text1.charAt(k);
            int count1 = map1.getOrDefault(String.valueOf(c), 0);
            int count2 = map2.getOrDefault(String.valueOf(c), 0);

            if (count1 != count2) {
                result = false;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}
