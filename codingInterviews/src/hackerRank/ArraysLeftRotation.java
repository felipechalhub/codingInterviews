package hackerRank;

import java.util.Arrays;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,5};
		int d = 4;
		System.out.println(Arrays.toString(rotLeft(ar, d)));
		
	}

	public static int[] rotLeft(int[] ar, int d) {
		int[] array = new int [ar.length];
		for (int i = 0; i < ar.length; i++) {
			array[i] = ar[(i+d) % ar.length];
		}
		return array ;
	}

}
