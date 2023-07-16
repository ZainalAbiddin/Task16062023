import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        var border = "--------------------------------------------------";
        System.out.println(border);
        System.out.println("Program app BCA Life Tech Interview");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(border);
            System.out.println("Main Menu");
            System.out.println(border);
            System.out.println("1. Checking String");
            System.out.println("2. Ticketing Price");
            System.out.println("3. Price Quantity");
            System.out.println("4. Manual Sort");
            System.out.println("5. Recursive Power");
            System.out.println("0. Shutdown Application");
            System.out.println(border);
            System.out.println("Input your choice menu :");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    str_cmp taskOne = new str_cmp();
                    taskOne.doCheckString();
                    promptEnterKey();
                    clearConsole();
                    System.out.flush();
                    break;
                case 2:
                    TicketingPrice taskTwo = new TicketingPrice();
                    taskTwo.doCheckPrice();
                    promptEnterKey();
                    clearConsole();
                    System.out.flush();
                    break;
                case 3:
                    PriceQuantity taskThree = new PriceQuantity();
                    taskThree.doPriceQuantity();
                    promptEnterKey();
                    clearConsole();
                    System.out.flush();
                    break;
                case 4:
                    ManualSortArray taskFour = new ManualSortArray();
                    taskFour.doManualSort();
                    promptEnterKey();
                    clearConsole();
                    System.out.flush();
                    break;
                case 5:
                    RecursivePower taskFive = new RecursivePower();
                    taskFive.doRecursivePower();
                    promptEnterKey();
                    clearConsole();
                    System.out.flush();
                    break;
                case 0:
                    clearConsole();
                    System.out.println("Shutdown Application");
                    System.out.println(border);
                    System.exit(0);
                    break;
                default:
                    promptEnterKey();
                    clearConsole();
                    System.out.println("Please Input Right Number");
                    break;
            }

        } while (true);
    }

    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
