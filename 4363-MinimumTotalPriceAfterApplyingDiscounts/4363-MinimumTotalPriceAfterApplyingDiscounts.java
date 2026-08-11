// Last updated: 11/08/2026, 21:01:15
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        
        int n=prices.length;
        int m=discounts.length;

        double total=0;

        for(int price :prices)
            total+=price;

        int count=Math.min(n,m);

        for(int i=0;i<count;i++){

            int price=prices[n-1-i];
            int discount=discounts[m-1-i];
            double saving=(double)price * discount / 100.0;
            total-=saving;
        }
        return total;
    }
}