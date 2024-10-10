public class bestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        int buyStock = Integer.MAX_VALUE;
        int differenceInStock = 0;
        for(int i = 0;i<prices.length;i++){
            buyStock=Math.min(buyStock,prices[i]);
            differenceInStock = Math.max(differenceInStock,prices[i]-buyStock);
        }
        return differenceInStock;
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome to Buy and Sell Stock!");
        int res = maxProfit(new int[]{2,7,11,15});
        System.out.println("The differenceInStock is: "+ res);
    }
}
