import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class TicketingPrice {
    public TicketingPrice() {
    }
    String border = "--------------------------------------------------";

    public void doCheckPrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of tickets you want to buy");
        int ticket = input.nextInt();
        if (ticket < 0) {
            System.out.println(border);
            System.out.println();
            System.out.println("Please input right number");
            System.out.println();
            System.out.println(border);
        } else if (ticket == 1) {
            System.out.println(border);
            System.out.println();
            System.out.println("Your ticket costs Rp 50.000,-");
            System.out.println();
            System.out.println(border);
        } else {
            DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
            dfs.setDecimalSeparator(',');
            dfs.setGroupingSeparator('.');
            DecimalFormat formatter = new DecimalFormat("###,###.###", dfs);
            var ticketString = formatter.format(checkPrice(ticket));
            System.out.println(border);
            System.out.println();
            System.out.println("Your ticket costs Rp " + ticketString + ",-");
            System.out.println();
            System.out.println(border);
        }
    }

    public int checkPrice(int ticket) {
        int checkTicket = ticket;
        if (ticket % 2 != 0) {
            checkTicket = ticket - 1;
        }
        int freeTicket = checkTicket / 2;
        int payTicket = ticket - freeTicket;
        return payTicket * 50000;
    }

}
