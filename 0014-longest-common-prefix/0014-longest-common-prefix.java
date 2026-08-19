class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String firstElement = strs[0];
        String lastElement = strs[strs.length - 1];

        for (int i = 0; i < Math.min(firstElement.length(), lastElement.length()); i++) {
            if (firstElement.charAt(i) != lastElement.charAt(i)) {
                return ans.toString();
            }
            ans.append(firstElement.charAt(i));
        }
        return ans.toString();
    }
}