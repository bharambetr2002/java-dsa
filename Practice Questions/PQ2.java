// Income Tacx Calculator (Else If - easy question)
// Income < 5L = 0% tax ; between 5-10L= 20% tax : income > 10L = 30% tax 

import java.util.Scanner;

public class PQ2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Income in Lakhs : ");
        double income = scn.nextDouble();
        if (income < 5) {
            System.out.println("You have to pay no tax");
        } else if (5 <= income && income<10) {
            System.out.println("You have to pay 20% Tax so your ammount is : " + (income * 0.2) + "L");
        } else {
            System.out.println("You have to pay 30% Tax so your ammount is : " + (income * 0.3) + "L");
        }
        scn.close();
    }
}
