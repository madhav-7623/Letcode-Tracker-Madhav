// Last updated: 11/08/2026, 21:05:52
class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int c[]=new int[26];
        int m=t.length();
        if(n!=m){
            return false;
        }
        for(char ch:t.toCharArray())
        c[ch-'a']++;
        for(char ch:s.toCharArray())
        c[ch-'a']--;
        for(int num:c){
        if(num!=0)
        return false;}
        return true;
        

        
    }
}