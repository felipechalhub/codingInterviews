package codeSignal;

import java.util.Arrays;
import java.util.List;

public class CommonCharacter {

	public static void main(String[] args) {

		String s1 = "aabcc";
		String s2 = "adcaa";
		System.out.println(solution(s1, s2));
	}

	public static int solution(String s1, String s2) {

		int before = s1.length();
		for (int i = 0; i < s2.length(); i++) {
			s1 = s1.replaceFirst(s2.substring(i, i + 1), "");
		}
		int after = s1.length();
		return before - after;
	}

}
