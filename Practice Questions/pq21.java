//find the bigeest of the 3 number

import java.util.Scanner;

public class pq21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input No. to compare : ");
        System.out.println("No. 1 : ");
        int a = scn.nextInt();
        System.out.println("No. 2 : ");
        int b = scn.nextInt();
        System.out.println("No. 3 : ");
        int c = scn.nextInt();
        scn.close();

        if(a>=b && a>=c){
            System.out.println(a + " is the biggest number");
        }else if(b>=c){
            System.out.println(b + " is the biggest number");
        }else{
            System.out.println(c + " is the biggest number");
        }
    }
}
