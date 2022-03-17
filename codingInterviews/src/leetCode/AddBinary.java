package leetCode;

public class AddBinary {
	public static void main(String[] args) {
	String a = "11";
	String b = "1";
	
	System.out.println(addBinary(a,b));
	}
    public static String addBinary(String a, String b) {
    	StringBuilder sb = new StringBuilder();			//create string builder
    	int i = a.length()-1;							//get the reference of the left side of the string
    	int j = b.length()-1;	
    	int carry = 0;
    	
    	while(i >= 0 || j >= 0) {						//while the string is >= 0 which means its not the end of the string
    		int sum = carry; 							
    		if(i >= 0) sum+= a.charAt(i) - '0';			//convert the string into a int and add it to var sum
    		if(j >= 0) sum+= b.charAt(j) - '0';
    		sb.append(sum %2);							// if its 2, then 2%2 is 1. And append that 1
    		carry = sum/2;								//if its 2, we carry a 1
    		
    		i--;										//decrement i and j to get to the beginning of the string
    		j--;
    	}
    	if(carry != 0) sb.append(carry);				// if there is a carry left over, append it
		return sb.reverse().toString();					// reverse the stringbuilder because its adding the numbers from left to right and we want it the other way
    	
    	
        
    }
}
