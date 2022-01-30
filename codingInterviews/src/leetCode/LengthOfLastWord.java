package leetCode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		System.out.println(lengthOfLastWord(s));
		
	}
    public static int lengthOfLastWord(String s) {
    	
    	String [] words = s.split(" "); 
    	String lastWord = words[words.length-1];
    	int length = lastWord.length();
    	
    	return length;
    	
    }
}
