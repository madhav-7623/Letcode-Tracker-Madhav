// Last updated: 11/09/2026, 09:43:08
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
        if(num%2==0){
        num=num/2;
        count++;}
        else{
        num =num-1;
        count++;}
        }
        return count;
     }
}