package codeSignal;

public class ArrayMaximalAdjacentDifference {
	public static void main(String[] args) {

		int[] a = { 2, 4, 1, 0 };
		System.out.println(solution(a));
	}

	public static int solution(int[] inputArray) {
		int max = Math.abs(inputArray[0] - inputArray[1]);

		for (int i = 0; i < inputArray.length - 1; i++) {
			int num = Math.abs(inputArray[i] - inputArray[i + 1]);
			if (num > max)
				max = num;
		}
		return max;
	}
}
