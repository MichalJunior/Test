package zadanie1;

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
                orangeQuantity++;
            }
        }
        if (appleQuantity > orangeQuantity) {
            int totalQuantity = appleQuantity - orangeQuantity;
            System.out.println("Minimalna różnica: " + totalQuantity);
        }
        if (orangeQuantity > appleQuantity) {
            int totalQuantity = orangeQuantity - appleQuantity;
            System.out.println("Minimalna różnica: " + totalQuantity);
        } else if (orangeQuantity == appleQuantity) {
            System.out.println(0);
        }
        System.out.println("Ilośc Jabłek po zakupie: " + appleQuantity);
        System.out.println("Ilość pomarańczy po zakupie: " + orangeQuantity);


    }
}

