package LeetCodeSolutions;

import java.util.LinkedList;
import java.util.Queue;

public class Problem649 {
    public static void main(String[] args) {
        String senate = "RD";
        System.out.println(predictPartyVictory(senate));
    }
        public static String predictPartyVictory(String senate) {
            Queue<Integer> qr = new LinkedList<>();
            Queue<Integer> qd = new LinkedList<>();
            int size = senate.length();
            for(int i = 0; i < size; i++){
                if(senate.charAt(i) == 'R'){
                    qr.add(i);
                } else {
                    qd.add(i);
                }
            }
            for(;!qr.isEmpty() && !qd.isEmpty();){
                int r = qr.poll();
                int d = qd.poll();
                if(r < d){
                    qr.add(r + size);
                } else {
                    qd.add(d + size);
                }
            }
            return (qr.size() > qd.size()) ? "Radiant" : "Dire";
        }
}
