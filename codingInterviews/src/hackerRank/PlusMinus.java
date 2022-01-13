package hackerRank;

public class PlusMinus {
	
	public static void main(String[] args) {
		int arr [] = {-4, 3, -9, 0, 4, 1};
		int pos = 0;
		int neg = 0;
		int zero = 0;
		int size = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				pos++;
			else if(arr[i]<0)
				neg++;
			else
				zero++;		
		}
		double dpos = ((double)pos/size);
		double dneg = ((double)neg/size);
		double dzero = ((double)zero/size);
		System.out.println(String.format("%.6f", dpos));
		System.out.println(String.format("%.6f", dneg));
		System.out.println(String.format("%.6f", dzero));
		}

}
