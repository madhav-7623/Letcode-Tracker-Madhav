// Last updated: 11/09/2026, 09:47:19
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Scanner sc=new Scanner (System.in);
         Stack<Character> stack = new Stack<>();
         Stack<Character> Nstack=new Stack<>();
        for(char ch:s.toCharArray()){
         if(ch=='#'){
            if(!stack.isEmpty())
            stack.pop();}
         else
           stack.push(ch);
         }
         for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!Nstack.isEmpty())
                Nstack.pop(); }
            else
            Nstack.push(ch);
         }
         if(stack.equals(Nstack))
         return true;
         else
         return false;
    }
}