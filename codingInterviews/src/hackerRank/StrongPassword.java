package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "Ab1";
        System.out.println(minimumNumber(password.length(), password));
    }
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minLength = 6;
        List<String> requirements = new ArrayList<>();
        requirements.add("0123456789");
        requirements.add("abcdefghijklmnopqrstuvwxyz");
        requirements.add("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        requirements.add("!@#$%^&*()-+");
        for ( char c : password.toCharArray()) {
            int i = 0;
            while (i < requirements.size()) {
                if (requirements.get(i).contains(c + "")) {
                    requirements.remove(i);
                } else {
                    i ++;
                }
            }
        }
        return Math.max(requirements.size(), minLength - password.length());
    }
}
