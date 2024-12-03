package Arrays;

import java.sql.SQLOutput;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 20, 200, 10,10, 10};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {

        int minCostPrice = arr[0];
        int maxProfit = 0;
        for(int i = 1; i< arr.length; i++){
            minCostPrice = Math.min(minCostPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minCostPrice);
        }

        return maxProfit;
    }
}
