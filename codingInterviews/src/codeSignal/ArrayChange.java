package codeSignal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayChange {

	public static void main(String[] args) {
		int[] inputArray = { -1000, 0, -2, 0};
		System.out.println(solution(inputArray));
	}

	public static int solution(int[] inputArray) {

		int count = 0;
		
		for (int i = 1; i < inputArray.length; i++) {
			if(inputArray[i-1] >= inputArray[i]) {
				int difference = Math.abs(inputArray[i - 1] - inputArray[i]) + 1 ;
				inputArray[i] += difference;
				count += difference;
			}
		}
		System.out.println(Arrays.toString(inputArray));
		
		return count;
	}
}
