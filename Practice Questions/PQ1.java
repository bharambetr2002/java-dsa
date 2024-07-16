// Print if the number is Odd or Even (If,Else - Easy Question)

import java.util.Scanner;

public class PQ1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        };
        scn.close();
    }
}
