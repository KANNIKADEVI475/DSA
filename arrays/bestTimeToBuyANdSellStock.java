package arrays;

public class bestTimeToBuyANdSellStock {
     public int maxProfit(int[] prices) {
        int sell=Integer.MIN_VALUE;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(prices[i],buy);
            sell=Math.max(prices[i]-buy,sell);
        }
        return sell;
    }
}
