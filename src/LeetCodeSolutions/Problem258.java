// Add digits
package LeetCodeSolutions;

import java.util.Scanner;

public class Problem258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        int num = sc.nextInt();
        int ans = addDigits(num);
        System.out.println("The result is : " + ans);
    }

    private static int addDigits(int num) {
        if(num == 0){
            return num;
        }
        while(num > 0){
            if(num == 1 || num == 2 || num == 3 || num == 4 ||
                    num == 5 || num == 6 || num == 7 || num == 8 || num == 9){
                return num;
            }else {
                num = findSum(num);
            }
        }
        return num;
    }

    private static int findSum(int num) {
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }
}
