import java.util.Scanner;

public class str_cmp {

    public str_cmp() {
    }

    String border = "--------------------------------------------------";

    public void doCheckString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your First String");
        String firstString = input.nextLine();
        System.out.println("Input your Second String");
        String secondString = input.nextLine();
        System.out.println(border);
        System.out.println();
        System.out.println("Comparing " + firstString + " and " + secondString + " = " + checkString(firstString, secondString));
        System.out.println();
        System.out.println(border);
    }

    public boolean checkString(String firstString, String secondString) {
        int minLength = Math.min(firstString.length(), secondString.length());

        if (firstString.length() != secondString.length()) {
            return false;
        }

        for (int i = 0; i < minLength; i++) {
            var firstCharString = firstString.charAt(i);
            var secondCharString = secondString.charAt(i);

            if (firstCharString != secondCharString) {
                return false;
            }
        }

        return true;
    }

}
