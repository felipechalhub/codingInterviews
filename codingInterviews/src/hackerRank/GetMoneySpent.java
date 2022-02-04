package hackerRank;

public class GetMoneySpent {
	public static void main(String[] args) {
		
		int [] keyboards = {3,1};
		int [] drives = {5,2,8};
		int b = 10;
		
		System.out.println(getMoneySpent(keyboards, drives, b));
		
	}
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int ans = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum > b	)  continue;
                ans = Math.max(ans, sum);
            }  
        }
        return ans;
        
    }
}
