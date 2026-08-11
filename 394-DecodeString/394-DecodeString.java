// Last updated: 11/08/2026, 21:05:08
class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums= new Stack<>();
        Stack<String> st=new Stack<>();
        int n=0;
        String str="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c))
            n=n*10+c-'0';
            else if(Character.isAlphabetic(c))
            str+=c;
            else if(c=='['){
                nums.push(n);
                st.push(str);
                n=0;
                str="";
            }
            else{
                StringBuilder temp =new StringBuilder();
                int t=nums.pop();
                for(int i=0;i<t;i++)
                    temp.append(str);
                str=st.pop()+temp.toString();
                
            }
        }
        return str;
    }
}