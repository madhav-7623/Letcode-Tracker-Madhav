// Last updated: 11/08/2026, 21:01:14
class Solution {
    public int countValidPrefixes(String s) {
        int zero=0,one=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                zero++;
            else
                one++;
            if(Math.abs(zero-one)<=1)
                ans++;
        }
        return ans;
    }
}