// Last updated: 11/08/2026, 21:02:43
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '0';
            result[pos - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", result);
    }
}