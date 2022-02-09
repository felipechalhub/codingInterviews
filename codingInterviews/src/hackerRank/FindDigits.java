package hackerRank;

public class FindDigits {
	public static void main(String[] args) {

		int n = 101;
		System.out.println(findDigits(n));

	}

	public static int findDigits(int n) {
		//DISCLAIMER: This is not an original solution done by me. The author is practitioner20. I simply understood the code and explained to the best of my ability
	    String nStr = Integer.toString(n);			//converting given integer to string
	    int count = 0;								//initiating a counter to return at the end of the method
	    for (char c : nStr.toCharArray()) {			//looping through the whole integer and converting the string to an array
	        if (c == '0')							//if the character is == 0 then skip the current iteration because 0 cant divide anything
	            continue;
	        int rem = n % (c - '0');				//creating int to check if its divisable by the input. This is done by converting the char into an 
	        										//integer because ASCII character 0 is represented by 48 and when subtracted by a char, gives you
	        										//a proper conversion of a char to int
	        if (rem == 0)							//if its divisable, then it will return 0 and count should be added by 1
	            count++;
	    }
	    return count;
	}
}