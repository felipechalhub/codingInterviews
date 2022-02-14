package leetCode;

public class ImplementstrStr {
	public static void main(String[] args) {
		String haystack  = "hello";
		String needle  = "ll";
		System.out.println(strStr(haystack, needle));
	}
    public static int strStr(String haystack, String needle) {
    	if(haystack == null || needle == null ) return -1;
    	if(haystack.equals(needle)) return 0;
    	
    	for (int i = 0; i < haystack.length()- needle.length()+1; i++) {
    		if(haystack.substring(i, i +needle.length()).equals(needle))
    			return i;
		}
    	
    	return -1;
    }
}
