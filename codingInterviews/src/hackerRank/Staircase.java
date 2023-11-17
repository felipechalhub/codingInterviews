package hackerRank;

public class Staircase {

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }
    public static void staircase(int n) {
        for (int i =1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
