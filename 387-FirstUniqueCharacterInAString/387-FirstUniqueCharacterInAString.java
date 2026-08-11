// Last updated: 11/08/2026, 21:05:16
class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for (int i = 0; i < s.length(); i++) 
            if (freq[s.charAt(i)] == 1) 
                return i;

        return -1;
    }
}