package codeSignal;

public class AlphabeticShift {
	public static void main(String[] args) {
		String inputString = "crazy";
		System.out.println(solution(inputString));
	}
	public static String solution(String inputString) {

		char [] ans = inputString.toCharArray();
		for (int i = 0; i < ans.length; i++) {
			if(ans[i] == 'z') ans[i] = 'a';
			else
				ans[i]++;
		}
		
		return new String(ans);
	}

}
