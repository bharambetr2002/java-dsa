//check if a number is prime number or not

import java.util.Scanner;

public class pq35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = scn.nextInt();

        if(a==2){
            System.out.println("Number is prime");
        }else{
            boolean isPrime = true;
        for(int i=2; i<=a-1; i++){
                 if(a%i==0){
                    isPrime = false;
                 }
            }
            if(isPrime==true){
                System.out.println("Number is Prime");
            }else{
                System.out.println("Number is not Prime");
                }
            }
        scn.close();
        }
}
