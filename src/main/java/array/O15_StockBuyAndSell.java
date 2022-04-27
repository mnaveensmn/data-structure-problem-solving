package array;

public class O15_StockBuyAndSell {

    public int maxProfit(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int profit = 0;
        int currProfit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    currProfit = arr[j] - arr[i] + maxProfit(arr, start, i - 1) +
                            maxProfit(arr, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }
}
