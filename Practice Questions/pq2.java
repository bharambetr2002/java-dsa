// In a program, input the side of a square. You have to output the area of the square.

import java.util.Scanner;

public class pq2{
    public static void main(String[] args){
    
        Scanner src = new Scanner(System.in);

        System.out.print("Side of the Square");
        int side = src.nextInt();

        int area = (side * side);

        System.out.print("Area of the Square");   
        System.out.print(area);

        src.close();

    }
}