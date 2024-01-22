//keep entering numbers till user enters a muliple of 10

import java.util.Scanner;

public class pq33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Enter the Number : ");
            int n = scn.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        scn.close();
    }
}
