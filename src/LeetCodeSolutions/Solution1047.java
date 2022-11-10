package LeetCodeSolutions;

public class Solution1047 {
    public static void main(String[] args) {
        String s = "aababaab";
        String res = removeDuplicates(s);
        System.out.println(res);

    }
    public static String removeDuplicates(String s) {
        int len = s.length();
        String result ="";
        for(int i = 0; i < len; ){
            String temp1 = "";
            String temp2 = "";
            if((i+1) < len && (i+2) < len && (i+3) < len){
                temp1 = String.valueOf(s.charAt(i) +  s.charAt(i+1));
                temp2 = String.valueOf(s.charAt(i+3) + s.charAt(i+2));
                if(temp1.equals(temp2)){
                    i = i + 4;
                    continue;
                }else{
                    result += s.charAt(i);
                    i++;
                }
            }else {
                result += s.charAt(i);
                i++;
            }
        }
        return result;
    }
}
