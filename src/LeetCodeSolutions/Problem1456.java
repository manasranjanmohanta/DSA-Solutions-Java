package LeetCodeSolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1456 {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
        public static int maxVowels(String s, int k) {
            List<Character> v = Arrays.asList('a', 'e', 'i', 'o', 'u');
            Set<Character> vowels = new HashSet<>(v);
            int vCount = 0;
            for(int i = 0; i < k ; i++){
                if(vowels.contains(s.charAt(i))){
                    vCount++;
                }
            }
            int left = 0, right = k - 1;
            int maxVC = vCount;
            while(right < s.length() - 1){
                if(vowels.contains(s.charAt(left))){
                    vCount--;
                }
                left++;
                right++;
                if(vowels.contains(s.charAt(right))){
                    vCount++;
                }
                maxVC = Math.max(maxVC, vCount);
            }
            return maxVC;

        }

}
