package leetCode;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "g";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
            int capital = 0;
            int small = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                capital ++;
            }
            else{
                small++;
            }

            }
        if(capital == word.length() || small == word.length())
            return true;

        else if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && small == word.length()-1)
            return true;
        else
            return false;
    }
}
