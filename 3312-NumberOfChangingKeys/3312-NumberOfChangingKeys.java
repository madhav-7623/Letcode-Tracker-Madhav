// Last updated: 11/08/2026, 21:01:28
class Solution {
    public int countKeyChanges(String s) {
        int count =0;
        s.toLowerCase();
      for (int i = 1; i < s.length(); i++) {
            char prev = Character.toLowerCase(s.charAt(i - 1));
            char curr = Character.toLowerCase(s.charAt(i));

            if (prev != curr) {
                count++;
            }
        }

        return count;
    }
}