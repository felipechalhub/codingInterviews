package codeSignal;

public class reverseInParenthesis {
	public static void main(String[] args) {
		String input = "(bar)";
		System.out.println(solution(input));
	}

	public static String solution(String inputString) {
		int firstInd = inputString.lastIndexOf("(");
		int lastInd = inputString.indexOf(")", firstInd);
		
		while(firstInd != -1) {
			String revStr = new StringBuilder(inputString.substring(firstInd+1, lastInd)).reverse().toString();
			String first = inputString.substring(0, firstInd);
			String last = inputString.substring(lastInd+1);
			inputString = first+revStr+last;
			firstInd = inputString.lastIndexOf("(");
			lastInd = inputString.indexOf(")", firstInd);
		}
		
		return inputString;

	}

}
