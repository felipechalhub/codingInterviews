package codeSignal;

public class makeArrayConsecutive {
	public static void main(String[] args) {
		int[] statues = {6, 2, 3, 8};
		System.out.println(solution(statues));
	}
	public static int solution(int[] statues) {
		int max = statues[0];
		int min = statues[0];
		int diff;
		
		for (int i = 0; i < statues.length; i++) {
			if(statues[i]>max)
				max = statues[i];
			if(statues[i]< min)
				min = statues[i];
		}
		diff = max-min;
		int ans = (diff - statues.length)+1;
		return ans;
	}
}
