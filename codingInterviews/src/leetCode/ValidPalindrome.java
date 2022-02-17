package leetCode;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
    public static boolean isPalindrome(String s) {
    	String fixed = "";
    	
    	for(char c : s.toCharArray()) {
    		if(Character.isLetter(c) || Character.isDigit(c))
    			fixed += c;
    	}
    	
    	fixed = fixed.toLowerCase();
    	int a_pointer = 0;
    	int b_pointer = fixed.length()-1;
    	
    	while(a_pointer <= b_pointer) {
    		if(fixed.charAt(a_pointer) != fixed.charAt(b_pointer)) {
    			return false;
    		}
    		a_pointer++;
    		b_pointer--;
    	}
		return true;
        
    }
}
