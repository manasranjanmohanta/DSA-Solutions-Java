package LeetCodeSolutions;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,4,5,2,7,2,2};
        int count= 0;
        for (int i: arr) {
           if(i == 2){
               count++;
           }
        }
        System.out.println(count);
    }
}
