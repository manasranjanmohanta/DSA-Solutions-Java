package LeetCode;

import java.util.Arrays;

public class Problem1672 {
    public static void main(String[] args) {
       int[][] accounts = {{1,5},{7,3},{3,5}};
       int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {

        int[] arr = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            arr[i] =  sum;
        }
        Arrays.sort(arr);
        return (arr[arr.length - 1]);
    }
}
