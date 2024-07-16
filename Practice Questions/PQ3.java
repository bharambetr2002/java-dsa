//Print the largest of 3 numbers (Else if - basic question )

import java.util.Scanner;

public class PQ3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);   
        System.out.println("Enter Number a : ");
        int a = scn.nextInt();
        System.out.println("Enter Number b : ");
        int b = scn.nextInt();
        System.out.println("Enter Number c : ");
        int c = scn.nextInt();
        if((a>=b)&&(a>=c)){
            System.out.println("The largest number in a ");
        }else if((b>=c)){
            System.out.println("The largest number in b ");
        }else {
            System.out.println("The largest number in c ");
        }
        scn.close();
    }
}
