package codeSignal;

import java.util.Arrays;

public class Ipv4Address {

	public static void main(String[] args) {

		String s = "1.1.1.1a";
		System.out.println(solution(s));
	}

	public static boolean solution(String inputString) {
		String[] result = inputString.split("\\.");
		if (result.length != 4)
			return false;
		try {
			for (int i = 0; i < result.length; i++) {
				if (result[i].isEmpty() || Integer.parseInt(result[i]) > 255 || Integer.parseInt(result[i]) < 0)
					return false;
			}
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}

}
