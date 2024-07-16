//Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class PQ6 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temperature readings : ");
        double a = scn.nextDouble();
        if (a > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
        scn.close();

    }
}
