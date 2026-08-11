// Last updated: 11/08/2026, 21:04:26
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
           int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && 
                   temperatures[i] > temperatures[st.peek()]) {

                int prevIndex = st.pop();
                result[prevIndex] = i - prevIndex;
            }

            st.push(i);
        }

        return result;
    }
}