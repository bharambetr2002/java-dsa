//code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class pq24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your body temperature : ");
        double temp = scn.nextDouble();
        scn.close();

        String fever = (temp>100)?"Yes":"No"; 

        System.out.println("Fever Status : " + fever );
    }
}
