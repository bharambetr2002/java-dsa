// print if a number is odd or even

import java.util.Scanner;

public class pq18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Input no a: ");
        int a = scn.nextInt();

        scn.close();

        if(a%2==0){
            System.out.println("Number a is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
