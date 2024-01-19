package hackerRank;

public class CatAndMouse {
    public static void main(String[] args) {

        System.out.println(catAndMouse(2,5,4));
    }
    static String catAndMouse(int x, int y, int z) {
        int cat1 = Math.abs(x-z);
        int cat2 = Math.abs(y-z);
        if(cat1>cat2){
            return "Cat B";
        }
        else if(cat1<cat2){
            return "Cat A";
        }
        else{
            return "Mouse C";
        }
    }
}
