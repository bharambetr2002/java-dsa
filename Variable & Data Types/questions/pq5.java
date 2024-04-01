//Calculate the area of the circle 

import java.util.Scanner;

public class pq5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        int rad = scn.nextInt();
        double radius = 3.14 * rad * rad;
        System.out.println("Radius of circle is : " + radius);
        scn.close();
    }
}