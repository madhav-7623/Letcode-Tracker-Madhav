// Last updated: 08/10/2026, 08:58:41
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder result = new StringBuilder();
4
5        while (columnNumber > 0) {
6            columnNumber--;
7
8            char ch = (char) ('A' + columnNumber % 26);
9            result.append(ch);
10
11            columnNumber /= 26;
12        }
13
14        return result.reverse().toString();
15    }
16}