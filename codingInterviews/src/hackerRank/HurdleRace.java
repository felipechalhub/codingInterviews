package hackerRank;

import java.util.Arrays;
import java.util.List;

public class HurdleRace {
	public static void main(String[] args) {
		List<Integer> height = Arrays.asList(2, 5, 4, 5, 2);
		int k = 7;
		System.out.println(hurdleRace(k,height));
	}

	public static int hurdleRace(int k, List<Integer> height) {
		int max = 0;
		int ans = 0;
		for (int i = 0; i < height.size(); i++) {
			if(height.get(i)> max)
				max = height.get(i);
		}
			if(k>max)
				return 0;
			else 
				ans = max-k;
			
		return ans;

	}

}
