package LeetCodeSolutions;

import java.util.Arrays;

public class Problem1491 {
    public static void main(String[] args) {
        int[] salary = {4000, 2000, 3000, 1000};
        System.out.println(average(salary));
    }

    private static double average(int[] salary) {
        Arrays.sort(salary);
        double sumOfSalary = 0, employees = 0;
        for(int i = 1; i < salary.length - 1; i++){
            sumOfSalary += salary[i];
            employees++;
        }
        return sumOfSalary / employees;
    }
}
