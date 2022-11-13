package LeetCodeSolutions;

import java.util.Arrays;
import java.util.Collections;

public class Problem151 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String res = reverseWords(s);
        System.out.println(res);
    }
        public static String reverseWords(String s) {
            String[] words = s.trim().split(" +");
            Collections.reverse(Arrays.asList(words));
            return String.join(" ", words);
        }
}
