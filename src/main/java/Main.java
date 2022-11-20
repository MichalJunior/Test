import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int appleQuantity;
        int orangeQuantity;
        int moneyQuantity;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile jabłek?:");
        appleQuantity = scanner.nextInt();
        System.out.print("Ile pomaranczy?:");
        orangeQuantity = scanner.nextInt();
        System.out.print("Ile pieniędzy?:");
        moneyQuantity = scanner.nextInt();

        for (int i = moneyQuantity; i > 0; i--) {
            if (appleQuantity > orangeQuantity) {
                orangeQuantity++;
            }
            if (orangeQuantity > appleQuantity) {
                appleQuantity++;
            } else if (orangeQuantity == appleQuantity) {
                appleQuantity++;
            }
            i--;
        }
        System.out.println("Ilośc Jabłek po zakupie: " + appleQuantity);
        System.out.println("Ilość pomarańczy po zakupie: " + orangeQuantity);
        if (appleQuantity > orangeQuantity) {
            int totalQuantity = appleQuantity - orangeQuantity;
            System.out.println("Minimalna różnica: " + totalQuantity);
        }
        if (orangeQuantity > appleQuantity) {
            int totalQuantity = orangeQuantity - appleQuantity;
            System.out.println("Minimalna różnica: " + totalQuantity);
        }

        System.out.println("-----Kupuj dalej,łasuchu :) ----");
        moneyQuantity = 0;
        orangeQuantity = 0;
        appleQuantity = 0;

    }
}

