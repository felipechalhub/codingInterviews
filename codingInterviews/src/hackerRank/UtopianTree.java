package hackerRank;

public class UtopianTree {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(utopianTree(n));
    }
    public static int utopianTree(int n) {
        int ans = 1;
        int cycles = 0;
        while(cycles != n){
            ans = ans*2;
            cycles++;
            if(cycles == n)
                break;
            ans++;
            cycles++;

        }
        return ans;
    }

}
