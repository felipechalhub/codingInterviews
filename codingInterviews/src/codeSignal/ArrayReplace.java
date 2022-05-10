package codeSignal;

import java.util.Arrays;

public class ArrayReplace {
	public static void main(String[] args) {

		int[] i = { 1, 2, 1 };
		int e = 1;
		int s = 3;
		System.out.println(solution(i, e, s));
	}

	public static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {

		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == elemToReplace)
				inputArray[i] = substitutionElem;
		}
		return inputArray;
	}

}
