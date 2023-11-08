package hackerRank;

public class isPrime {
    public static void main(String[] args) {

        //return 1 if its prime, otherwise return input number
        System.out.println(isPrime((23)));
    }
    public static long isPrime (long n){
        if(n <=1)
            return n;

        for (int i = 2; i < n ; i++) {
            if( n%i == 0){
                return n;
            }
        }
        return 1;
    }
}
