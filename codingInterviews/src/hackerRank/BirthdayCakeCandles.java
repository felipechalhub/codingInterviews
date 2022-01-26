package hackerRank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		List<Integer> candles = Arrays.asList(3,2,1,3);

		System.out.println(birthdayCakeCandles(candles));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int ans = 0;
		int max = 0;
		for (int i = 0; i < candles.size(); i++) {
			if(candles.get(i)> max) 	
				max = candles.get(i);
		}
		for (int i = 0; i < candles.size(); i++) {
			if(candles.get(i) == max)
				ans++;
		}
		return ans;
		
	}

}
