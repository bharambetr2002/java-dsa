//print sum of first n natural numbers

import java.util.Scanner;

public class pq29{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scn.nextInt();
        scn.close();
        int a = 1;
        int sum = 0;

        while(a<=n){
            sum = sum + a++;
        }
        System.out.println(sum);
    }
}