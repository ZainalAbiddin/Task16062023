import java.util.Scanner;

public class RecursivePower {

    public RecursivePower() {
    }
    String border = "--------------------------------------------------";

    public void doRecursivePower(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base number");
        float base = input.nextFloat();
        System.out.println("Please enter power Raised Number");
        float powerRaised = input.nextFloat();
        if(powerRaised < 0){
            base = 1/base;
            powerRaised = powerRaised * -1;
        }
        float result = checkPower(base,powerRaised);
        System.out.println(border);
        System.out.println();
        System.out.println(base + " ^ " + powerRaised + " = " + result);
        System.out.println();
        System.out.println(border);
    }
    public float checkPower(float base, float powerRaised) {
        if(powerRaised > 0){
            return (base * checkPower(base, powerRaised - 1));
        }
        else {
            return 1;
        }
    }

}
