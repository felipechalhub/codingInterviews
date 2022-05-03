package codeSignal;

public class adjacentElementProduct {
	public static void main(String[] args) {
		int [] inputArray = {3, 6, -2, -5, 7, 3};
		System.out.println(solution(inputArray));
	}
	public static int solution(int [] inputArray) {
		int max = inputArray[0] * inputArray[1];
		
		for (int i = 0; i < inputArray.length-1; i++) {
			int j = i+1;
			if(inputArray[i] * inputArray[j] > max)
				max = inputArray[i] * inputArray[j];
		}
	return max;	
	}
}
