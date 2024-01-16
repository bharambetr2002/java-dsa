//Find the year is a leap year or not

import java.util.Scanner;

public class pq20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year%4==0){
            System.out.println("This is a lear year");
        }else{
            System.out.println("This is not a leap year");
        }

        scn.close();
    }
}
