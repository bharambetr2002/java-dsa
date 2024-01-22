//display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class pq34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("enter number: ");
            int a = scn.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println("number was: " + a);
        }while(true);
    }
}
