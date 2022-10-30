// Strings to Integer(Atoi)
package LeetCodeSolutions;

public class Solution8 {
    public static void main(String[] args) {
        int res = myAtoi("  -56");
        System.out.println(res);
    }
    public static int myAtoi(String s) {
        if(s.length() == 0){
            return 0;
        }

        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        char flag = '+';
        if(i < s.length()){
            if(s.charAt(i) == '-'){
                flag = '-';
                i++;
            } else if (s.charAt(i) == '+'){
                flag = '+';
                i++;
            }
        }

        double result = 0;
        while(s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }

        if(flag == '-'){
            result = -result;
        }

        if(result >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)result;
    }
}
