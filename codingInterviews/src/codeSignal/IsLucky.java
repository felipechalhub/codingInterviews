package codeSignal;

public class IsLucky {
	public static void main(String[] args) {
		int n  = 1231;
		System.out.println(solution(n));
	}
	public static boolean solution(int n) {
		
		String num = n+"";
		int sum = 0;

		for (int i = 0; i < num.length()/2; i++) {
			int l = (int) num.charAt(i);
			int r = (int) num.charAt(num.length()-i-1);
			sum+=l-r;
		}
			
		return sum==0;
	}
}
