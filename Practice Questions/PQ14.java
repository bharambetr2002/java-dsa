// Keep Entering numbers till user enters a multiple of 10

import java.util.Scanner;

public class PQ14 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");

        do {
            int a = scn.nextInt();
            if (a % 10 == 0) {
                break;
            }
            System.out.println(a);

        } while (true);
    }
}
