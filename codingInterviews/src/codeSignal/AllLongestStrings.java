package codeSignal;

import java.util.Arrays;

public class AllLongestStrings {
	public static void main(String[] args) {
		String[] inputArray = { "aa"};
		System.out.println(Arrays.toString(solution(inputArray)));

	}

	public static String[] solution(String[] inputArray) {
		int max = inputArray[0].length();
		int size = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i].length() >= max) {
				max = inputArray[i].length();
				size++;
			}
		}
		
		String [] ans = new String [size];
		int j =0;
		
//		for (int i = 0; i < inputArray.length; i++) {
//			if(inputArray[i].length() == max) {
//				ans[j] = inputArray[i];
//				j++;
//			}
//				
//		}
		System.out.println(size);
		return ans;

	}
}
