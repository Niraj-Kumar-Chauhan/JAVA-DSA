import java.util.*;
public class Buy_Sell_Stock {

    public static int BuySellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
               int currProfit = prices[i] - buyPrice;
               profit = Math.max(currProfit , profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int prices[] = {7 , 1 , 5 , 3 , 6 ,4};
        int ProfitStock = BuySellStock(prices);
        System.out.println("Maximum profit of the stock is : " + ProfitStock);
    }
}
