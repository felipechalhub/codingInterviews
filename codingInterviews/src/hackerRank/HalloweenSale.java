package hackerRank;

public class HalloweenSale {
	public static void main(String[] args) {
		System.out.println(howManyGames(20,3,6, 85));
	}

	public static int howManyGames(int p, int d, int m, int s) {
		// Return the number of games you can buy
		int result = 0;
		
		while(s>=p) {					//while my budget is >= everything I already bought
			s-=p;						// my budget = my budget - current price
			result++;					// increment by 1 the number of items i just bought
			
			p = Math.max(m, p-d);		//get the value of the next game. Its either the current price - d or the minimum price
		}
		
		return result;
	}
}