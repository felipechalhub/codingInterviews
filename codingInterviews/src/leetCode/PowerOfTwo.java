package leetCode;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(12));
    }
    public static boolean isPowerOfTwo(int n) {

        double ans = n;
        while(ans>0)
            if(ans == 1){
                return true;
            }
        else{
                ans = ans/2;
                if(ans <1)
                    break;
            }

        return false;
    }

}
