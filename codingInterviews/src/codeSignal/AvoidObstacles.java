package codeSignal;
public class AvoidObstacles {

	public static void main(String[] args) {

		int[] in = { 5, 3, 6, 7, 9 };
		System.out.println(solution(in));

	}

	public static int solution(int[] inputArray) {
		int jump = 2;
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i] % jump);
			if (inputArray[i] % jump == 0) {
				i = -1;
				jump++;
			}
		}
		return jump;
	}

}
