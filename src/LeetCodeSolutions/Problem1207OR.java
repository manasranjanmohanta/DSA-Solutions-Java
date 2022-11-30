package LeetCodeSolutions;

import java.util.Arrays;
import java.util.HashSet;

public class Problem1207OR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        final int k = 1000;
        int[] freq = new int[2 * k + 1];

        for(int num : arr){
            freq[num + k]++;
        }

        Arrays.sort(freq);
        for(int i = 0; i < 2 * k; i++){
            if(freq[i] != 0 && freq[i] == freq[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
