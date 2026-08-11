// Last updated: 11/08/2026, 21:03:47
import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] s1 = a.split(" ", 2);
            String[] s2 = b.split(" ", 2);

            boolean l1 = Character.isLetter(s1[1].charAt(0));
            boolean l2 = Character.isLetter(s2[1].charAt(0));

            if (l1 && l2) {
                int cmp = s1[1].compareTo(s2[1]);
                if (cmp != 0)
                    return cmp;
                return s1[0].compareTo(s2[0]);
            }

            if (l1) return -1;
            if (l2) return 1;

            return 0;
        });

        return logs;
    }
}