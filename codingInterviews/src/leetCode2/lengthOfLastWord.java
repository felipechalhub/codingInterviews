package leetCode2;

public class lengthOfLastWord {
	public static void main(String[] args) {
		
		String s = "Hello World  ";
		System.out.println(lengthOfLastWord(s));
	}
    public static int lengthOfLastWord(String s) {
    	s = s.replaceAll("\\s+$", "");
        int lastWord = 0;
    	for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i) != ' ')
			{
	    		lastWord++;
			}
			else
			{
				break;
			}
		}
    	return lastWord;
    }
	
}
