package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeSet;

public class K번째큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String[] numsStr = br.readLine().split(" ");
        int[] nums = new int[numsStr.length];
        for (int i=0; i<numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        int result = solution(n, k, nums);

        System.out.println(result);
    }

    private static int solution(int n, int k, int[] nums) {
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int l=j+1; l<n; l++) {
                    tSet.add(nums[i] + nums[j] + nums[l]);
                }
            }
        }

        int result = -1;
        int count = 0;
        for (Integer set : tSet) {
            count++;
            if (count == k) {
                result = set;
            }
        }

        return result;
    }
}
