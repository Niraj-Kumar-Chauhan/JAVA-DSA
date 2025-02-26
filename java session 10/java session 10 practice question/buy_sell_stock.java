import java.util.*;
public class buy_sell_stock {
    public static int BuySellStock(int arr[]){
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i<n; i++){
            if(buyPrice > arr[i]){
                buyPrice = arr[i];
            }else{
              int curProfit = arr[i] - buyPrice;
              profit = Math.max(curProfit , profit);
                
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int prices[] = {7, 4, 1, 3, 6,  4};
        int profit = BuySellStock(prices);
        System.out.println("The profit of stock is : " + profit);
    }
}
