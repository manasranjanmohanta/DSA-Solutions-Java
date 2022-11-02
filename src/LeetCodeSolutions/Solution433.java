package LeetCodeSolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution433 {
        public static void main(String[] args) {
            String start = "AACCGGTT", end = "AACCGGTA";
            String[] bank = {"AACCGGTA"};
            int res = minMutation(start, end, bank);
            System.out.println(res);
        }

        public static int minMutation(String start, String end, String[] bank) {
            char[] choices = {'A', 'C', 'G', 'T'};
            Set<String> bankSet = new HashSet<String>();
            Set<String> seen = new HashSet<String>();

            for(String b : bank){
                bankSet.add(b);
            }
            Queue<String> queue = new LinkedList<String>();
            queue.offer(start);
            seen.add(start);
            int level = 0;
            char[] currArr;
            while(!queue.isEmpty()){
                int size = queue.size();
                while(size-- > 0){
                    String curr = queue.poll();
                    if(curr.equals(end)){
                        return level;
                    }
                    currArr = curr.toCharArray();
                    for(int i = 0; i < currArr.length; i++){
                        char old = currArr[i];
                        for(char c: choices){
                            currArr[i] = c;
                            String newStr = new String(currArr);
                            if(!seen.contains(newStr) && bankSet.contains(newStr)){
                                queue.offer(newStr);
                                seen.add(newStr);
                            }
                        }
                        currArr[i] = old;
                    }
                }
                level++;
            }
            return -1;
        }
}
