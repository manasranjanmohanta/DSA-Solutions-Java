package LeetCodeSolutions;

import java.util.Arrays;

public class Solution344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l' , 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int j = s.length - 1;
        for(int i = 0; i < s.length; i++){
            temp[j] = s[i];
            j--;
        }
        for(int i = 0; i < s.length; i++){
            s[i] = temp[i];
        }
    }
}
