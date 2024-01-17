// print the numbers untill n

import java.util.Scanner;

public class pq28{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scn.nextInt();
        int a = 1;
        scn.close();

        while(a<=n){
            System.out.print(a+" ");
            a++;
        }
    }
}