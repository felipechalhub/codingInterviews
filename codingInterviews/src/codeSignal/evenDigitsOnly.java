package codeSignal;

public class evenDigitsOnly {

	public static void main(String[] args) {
		int n = 22;
		System.out.println(solution(n));
	}

	public static boolean solution(int n) {
		
	    if (n == 0) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return solution(n / 10);
        }

}
