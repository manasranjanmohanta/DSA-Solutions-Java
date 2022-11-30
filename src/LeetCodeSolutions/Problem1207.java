package LeetCodeSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Problem1207 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
    public static boolean uniqueOccurrences(int[] arr){
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                c++;
            } else {
                if(set.contains(c)) {
                    return false;
                }
                set.add(c);
                c = 1;
            }
        }
        if(set.contains(c)){
            return false;
        }
        return true;
    }
}
