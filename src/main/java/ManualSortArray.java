import java.util.Scanner;

public class ManualSortArray {
    public ManualSortArray() {
    }

    String border = "--------------------------------------------------";

    public void doManualSort() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Array number to sort");
        String inputString = input.nextLine();
        String[] arrayString = null;
        try {
            arrayString = inputString.split(",");
        }catch (Exception ignored){
        }

        int[] arrayNumberDefault = new int[]{2, 10, 1, 7};
        if(null == arrayString || arrayString.length == 1){
            System.out.println(border);
            for (int j : sortManual(arrayNumberDefault)) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println(border);
        }else{
            int[] arrayNumber = new int[arrayString.length];
            for (int i = 0; i < arrayString.length; i++) {
                arrayNumber[i] = Integer.parseInt(arrayString[i]);
            }
            System.out.println(border);
            for (int j : sortManual(arrayNumber)) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println(border);
        }



    }

    public int[] sortManual(int[] arrayNumber) {
        int temp = 0;
        System.out.println("Elements of original array: ");
        for (int k : arrayNumber) {
            System.out.print(k + " ");
        }

        //Sort the array in descending order
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[i] < arrayNumber[j]) {
                    temp = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[j];
                    arrayNumber[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order : ");
        return arrayNumber;
    }
}
