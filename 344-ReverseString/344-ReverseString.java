// Last updated: 11/08/2026, 21:05:27
class Solution {
    public void reverseString(char[] s) {
        int r=0,e=s.length-1;
        while(r<e){
            char temp=s[r];
            s[r]=s[e];
            s[e]=temp;
            r++;
            e--;
        }
       System.out.println(s);
     }
}