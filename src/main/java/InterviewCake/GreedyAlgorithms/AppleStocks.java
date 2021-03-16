package InterviewCake.GreedyAlgorithms;

import java.lang.Integer;
public class AppleStocks {
	public static int getMaxProfitBruteForce(int[] stockPrices){
		int maxProfit = Integer.MIN_VALUE;
		for(int i=0;i<stockPrices.length;i++){
			for(int j=i+1;j<stockPrices.length;j++){
				int profitDiff = stockPrices[j]-stockPrices[i];
				if( profitDiff > maxProfit){
					maxProfit=profitDiff;
				}
			}
		}
		return maxProfit;
	}
	
	public static int getMaxProfit(int[] stockPrices){
		int minProfit = stockPrices[0];
		int maxProfit = stockPrices[1] - stockPrices[0];
		for( int i=1; i<stockPrices.length ; i++) {
			int currentPrice = stockPrices[i];
			int potentialProfit = currentPrice - minProfit;
			maxProfit = Math.max(maxProfit, potentialProfit);
			minProfit = Math.min(minProfit, currentPrice);
		}
		return maxProfit;
	}
	
	public static void main(String args[]) {
		int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
		//int[] stockPrices = new int[] {12,11,10,9,8,7};
		System.out.println("Maximum profit is : " + getMaxProfit(stockPrices));
	}
}