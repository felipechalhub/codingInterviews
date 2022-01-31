package hackerRank;

public class BeautifulDays {
	public static void main(String[] args) {
		int i = 20;
		int j = 23;
		int k = 6;

		System.out.println(beautifulDays(i, j, k));

	}

	public static int beautifulDays(int i, int j, int k) {
		int beautifulDays = 0;
		for (int l = i; l <= j; l++) {
			if (Math.abs(l - reverse(l)) % k == 0) {
				beautifulDays++;
			}
		}

		return beautifulDays;
	}

	public static int reverse(int i) {
		int result = 0;
		int pop;
		while (i != 0) {
			pop = i % 10;
			i /= 10;
			result = (result * 10) + pop;
		}
		return result;

	}
}
