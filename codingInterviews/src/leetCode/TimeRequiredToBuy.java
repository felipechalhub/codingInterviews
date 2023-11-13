package leetCode;

public class TimeRequiredToBuy {

    public static void main(String[] args) {

        int [] tickets = {2,3,2};
        System.out.println(timeRequiredToBuy(tickets, 2));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        int i = 0;
        while (tickets[k] > 0){
            if(tickets[i] != 0){
                tickets[i] = tickets[i]-1;
                i++;
                if(i == tickets.length){
                    i=0;
                }
                count++;
            }
            else{
                i++;
                if(i == tickets.length){
                    i=0;
                }
            }
        }
        return count;
    }

}
