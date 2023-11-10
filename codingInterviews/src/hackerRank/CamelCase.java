package hackerRank;

public class CamelCase {

    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(camelcase(s));
    }
    public static int camelcase(String s) {
        int num = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            {
                num++;
            }
        }
        return num;
    }
}
