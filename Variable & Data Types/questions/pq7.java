//In a program, input the side of a square. You have to output the area of the square

import java.util.Scanner;

public class pq7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of side of square : ");
        int side = scn.nextInt();
        int area = side * side;
        System.out.println("Area of the square is : " + area);
        scn.close();
    }
}
