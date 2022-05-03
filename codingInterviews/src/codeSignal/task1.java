package codeSignal;

import java.util.Arrays;
public class task1 {

	public static void main(String[] args) {
	
		int [] a = {4, 0, 1, -2, 3};
		int n = 5;
//		System.out.println(a[-1]);
		System.out.println(Arrays.toString(solution(n,a)));
	}
	public static int[] solution(int n, int[] a) {
		
		int [] ans = new int [n];
			
	    for (int i = 0; i < n; i++) {
	    	if (i == 0 || i == n - 1) {
	    	if(i==0) {
	    		ans[i] = a[i] + a[i+1];
	    	}
	    	else if(i==n-1) {
	    		ans[i] = a[i-1] + a[i];
	    	}
	    	}
	    	else {
	    		ans[i] = a[i-1] + a[i] + a[i+1];
	    	}
		}
	    return ans;
	}
}
