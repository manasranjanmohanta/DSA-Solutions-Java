package LeetCodeSolutions;
import java.util.Arrays;
public class Question378 {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int ans = kthsmallest(matrix, k);
        System.out.println(ans);
    }
    static int kthsmallest(int[][] matrix, int k){
        int[] arr = new int[matrix.length * matrix.length];
        int l = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[l] = matrix[i][j];
                l++;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];

    }
}
