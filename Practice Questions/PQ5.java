//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class PQ5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a = scn.nextInt();
        if(a>0){
            System.out.println("The number you enetered is Postive");
            
        }else if(a==0){
            System.out.println("The number you enetered is Zero");
        }
        else{
            System.out.println("The number you enetered is Negative");
        }
        scn.close();
    }
}
