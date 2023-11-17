package hackerRank;

public class LibraryFine {
    public static void main(String[] args) {

        System.out.println(libraryFine(2,7,1014,1,1,1015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;

        if(y2<y1)
        {
            return 10000;
        }
        else
        {
            if(m2<m1 && y2<=y1)
            {
                fine = (m1-m2) * 500;
            }
            else
            {
                if(d2<d1 && m2<=m1 && y2<=y1)
                {
                    fine = (d1 - d2) * 15;
                }
                else
                {
                    return 0;
                }
            }
        }
        return fine;
    }
}
