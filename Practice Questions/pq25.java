// Write a Java program to input week number (1-7) and print day of week name using switch case.

import java.util.Scanner;

public class pq25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the date");
        int day = scn.nextInt();
        scn.close();

        switch (day) {
            case 1,8,15,22,29:
                System.out.println("The Day is Monday");
                break;
            
            case 2,9,16,23,30:
                System.out.println("The Day is Tuesday");
                break;
        
            case 3,10,17,24,31:
                System.out.println("The Day is Wednesday");
                break;

            case 4,11,18,25:
                System.out.println("The Day is Thrusday");
                break;
                
            case 5,12,19,26:
                System.out.println("The Day is Friday");
                break;

            case 6,13,20,27:
                System.out.println("The Day is Saturday");
                break;

            case 7,14,21,28:
                System.out.println("The Day is Sunday");
                break;
        }
    }
}
