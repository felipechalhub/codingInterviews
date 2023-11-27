package hackerRank;

public class ViralAdvertising {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(viralAdvertising(n));

    }
    public static int viralAdvertising(int n) {
        int ans=2;
        int liked=2;
        int reached = 5;

        if(n==1) return 2;

        for (int i = 2; i <= n; i++) {
            reached = liked*3;
            liked= reached/2;
            ans+=liked;
        }
         return ans;
    }
}
