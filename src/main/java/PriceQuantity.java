import java.util.Scanner;

public class PriceQuantity {

    public PriceQuantity() {
    }

    String border = "--------------------------------------------------";

    public void doPriceQuantity(){
        Scanner input = new Scanner(System.in);
        int a = 10;
        System.out.println("Input parameter b");
        int b = input.nextInt();
        if(b < 1){
            b = 0;
        }
        System.out.println("Input parameter t");
        int t = input.nextInt();
        if(t < 1){
            t = 0;
        }
        while (a > b){
            System.out.println("Input parameter quantity");
            int qty = input.nextInt();
            System.out.println("Input parameter price");
            int price = input.nextInt();
            int p;
            if(qty > 5){
                p = (qty * price) -1;
            }else {
                p = (qty * price) +1;
            }
            b = b + qty;
            t = t + p;
        }
        System.out.println(border);
        System.out.println();
        System.out.println("Parameter b = "+b);
        System.out.println("Parameter t = "+t);
        System.out.println();
        System.out.println(border);
    }
}
