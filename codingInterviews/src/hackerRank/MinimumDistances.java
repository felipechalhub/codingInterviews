package hackerRank;

import java.util.Arrays;
import java.util.List;

public class MinimumDistances {
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(7, 1, 3, 4, 1, 7);
		System.out.println(equalizeArray(arr));
	}

	public static int equalizeArray(List<Integer> arr) {
		//this code didnt pass all test cases

		int distance = Integer.MAX_VALUE;

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {

				if (arr.get(i) == arr.get(j)) {
					int temp = j-i;
					if (temp < distance)
						distance = temp;
				}
			}
		}
		if (distance == Integer.MAX_VALUE)
			distance = -1;
		
		return distance;

	}
}
