package hackerRank;

public class timeConversion {

	public static void main(String[] args) {

		String s = "07:05:45AM";
		System.out.println(timeConversion(s));
	}

	public static String timeConversion(String s) {

		if (s.charAt(8) == 'P')
		{
			String sub = s.substring(0,8);
			String [] ans = sub.split(":");
			if(ans[0].equals("12"))
			{
				return ans[0] +":"+ ans[1] +":"+ ans[2];
			}
			ans[0]  = String.valueOf(Integer.valueOf(ans[0])+12);
			return ans[0] +":"+ ans[1] +":"+ ans[2];
		}
		else
		{
			String sub = s.substring(0,8);
			String [] ans = sub.split(":");
			if(ans[0].equals("12"))
			{
				ans[0] = "00";
				return ans[0] +":"+ ans[1] +":"+ ans[2];
			}
		}
		return s.substring(0,8);
	}
}
