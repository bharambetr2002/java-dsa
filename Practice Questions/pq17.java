//take input from user and compare them

import java.util.Scanner;

public class pq17 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Number to compare a : ");
        int a = scn.nextInt();
        System.out.println("Number to compare b : ");
        int b = scn.nextInt();

        scn.close();

        if(a>=b){
            System.out.println(a + " is greater than " + b);
        }else{
            System.out.println(b + " is greater than " + a);
        }
    }
}
