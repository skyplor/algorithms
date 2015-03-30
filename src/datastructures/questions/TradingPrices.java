package datastructures.questions;

public class TradingPrices {

    public int computeProfit(int[] a) {
	int minPrice = a[0];
	int currentPrice = a[0];
	int profit = 0;
	for (int i = 1; i < a.length; i++) {
	    currentPrice = a[i];
	    if (a[i] < minPrice) {
		minPrice = a[i];
	    }
	    int temp = currentPrice - minPrice;
	    if (temp > profit)
		profit = temp;
	}

	return profit;
    }
}
