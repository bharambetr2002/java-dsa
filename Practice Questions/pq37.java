//Write a program that reads a set of integers ,and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class pq37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter Number: ");
            number = scn.nextInt();

            if(number%2==0){
                evenSum = evenSum + number;
            }else{
                oddSum=+number;
            }

            System.out.print("Enter 1 to continue, Enter 2 to abort : ");
            choice = scn.nextInt();
        }while(choice==1);

        System.out.println("Sum of even Numbers " + evenSum);
        System.out.println("Sum of odd Numbers " + oddSum);

        scn.close();
    }
}