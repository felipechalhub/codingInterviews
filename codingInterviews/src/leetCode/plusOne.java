package leetCode;

import java.util.Arrays;

public class plusOne {
	public static void main(String[] args) {
	
	int [] digits  = {1,2,4};
	System.out.println(Arrays.toString(plusOne(digits)));
		
	}
    public static int[] plusOne(int[] digits) {
    	int lastIndex = digits.length;
    	
    	for (int i = lastIndex-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
    	}
    	int [] newDigits = new int [lastIndex+1];
    	newDigits[0] = 1;
    	return digits;
    }
}
