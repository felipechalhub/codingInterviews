package hackerRank;

import java.util.Arrays;
import java.util.List;

public class Mini_MaxSum {
	public static void main(String[] args) {
	List<Integer> input = Arrays.asList(7,69,2,221,8974);

	miniMaxSum(input);
	}

	public static void miniMaxSum(List<Integer> input) {
		long total = 0;
		long min = input.get(0);
		long max = input.get(0);
		
		for (int i = 0; i < input.size(); i++) {
			total += input.get(i);
			
			if(max<input.get(i))
				max = input.get(i);
			
			else if(min>input.get(i))
				min = input.get(i);
		}	
		System.out.println((total-max) + " " + (total-min));
	}
}
