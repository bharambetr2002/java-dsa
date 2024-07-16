//Basic Calculator using Switch

import java.util.Scanner;

public class PQ4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number a : ");
        int a = scn.nextInt();
        System.out.println("Enter The Number b : ");
        int b = scn.nextInt();
        System.out.println(
                "Enter The operation you wanna do : \n 1.ADD(+) \n 2.SUB(-) \n 3.Divide(/) \n 4.Multi(*) \n 5.Reminder(%) \n Enter the operation you wanna do: ");
        char input = scn.next().charAt(0);
        switch (input) {
            case '+':
                System.out.println(" Addition is : " + (a + b));
                break;
            case '-':
                System.out.println(" Subtraction is : " + (a - b));
                break;
            case '*':
                System.out.println(" Addition is : " + (a * b));
                break;
            case '/':
                System.out.println(" Addition is : " + (a / b));
                break;
            case '%':
                System.out.println(" Addition is : " + (a % b));
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        scn.close();
    }
}
