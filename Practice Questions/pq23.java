//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class pq23{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input Number : ");
        int number = scn.nextInt();
        scn.close();

        if(number>0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}