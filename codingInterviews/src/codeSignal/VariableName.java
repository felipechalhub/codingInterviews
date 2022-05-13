package codeSignal;

public class VariableName {

	public static void main(String[] args) {
		String name = "var_1__Int";
		System.out.println(solution(name));
	}

	public static boolean solution(String name) {
        return name.matches("[a-zA-z]+[\\w_]*"); 

	}
}
