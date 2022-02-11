package leetCode;

public class PalindromeNumber {
	public static void main(String[] args) {
		int x = 0;
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
    	
    	if(x<0 || (x % 10 == 0 && x != 0))
    		return false;
    	
    	int result = 0;
    	
    	while(x>result) {
    		result = result *10 + x % 10;	//12
    		x = x/10;						//1
    	}
    	
    	if(result == x || result/10 == x)
    		return true;
    	else
    		return false;
    }
}
