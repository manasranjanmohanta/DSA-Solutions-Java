// INTUTITION:
// CREATE A RESULT STRING TO STORE THE COMMON PREFIX CHARACTER
// SORT THE STRING ARRAY IN LEXICOGRAPHICALLY WHICH IS ALPHABETICALLY
// IF THE ARRAY IS SORTED THAT MEANS WE NEED CHECK ONLY THE FIRST ELEMENT AND LAST ELEMENT CHARACTERS
// IF THE CHARACTERS OF FIRST AND LAST ELEMENT DOESN'T MATCH THEN SIMPLE RETURN THE RESULT ARRAY
// OTHERWISE APPEND THE CHARACTER IN THE RESULT ARRAY
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String firstElement = strs[0];
        String lastElement = strs[strs.length - 1];

        for (int i = 0; i < Math.min(firstElement.length(), lastElement.length()); i++) {
            if (firstElement.charAt(i) != lastElement.charAt(i)) {
                return result.toString();
            }
            result.append(firstElement.charAt(i));
        }
        return result.toString();
    }
}