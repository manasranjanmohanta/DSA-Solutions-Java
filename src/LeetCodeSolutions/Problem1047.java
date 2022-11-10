package LeetCodeSolutions;

public class Problem1047 {
    public static void main(String[] args) {
        String s = "aababaab";
        String res = removeDuplicates(s);
        System.out.println(res);

    }
    public static String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char current_char = s.charAt(j);
            if (i > 0 && stack[i - 1] == current_char) {
                i--;
            } else {
                stack[i] = current_char;
                i++;
            }
        }
        return new String(stack, 0, i);
    }
}
