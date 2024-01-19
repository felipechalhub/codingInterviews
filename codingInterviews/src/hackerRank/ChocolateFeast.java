package hackerRank;

public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(15,3,2));
    }
    public static int chocolateFeast(int n, int c, int m) {
        int ans = 0;
        int wrapper = n/c;
        ans = wrapper;
        while (wrapper >= m){
            ans += wrapper/m;
            wrapper = wrapper/m + wrapper%m;
        }
        return ans;
    }
}
