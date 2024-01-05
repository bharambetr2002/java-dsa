// Enter cost of 3 items from the user (using float data type)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class pq3{
    public static void main(String[] args){

    Scanner src = new Scanner(System.in);

    System.out.print("Price of pencil:");
    float a = src.nextFloat();

    System.out.print("Price of pen:");
    float b = src.nextFloat();

    System.out.print("Price of eraser:");
    float c = src.nextFloat();

    System.out.print("No. of pencil:");
    int d = src.nextInt();

    System.out.print("No. of pen:");
    int e = src.nextInt();

    System.out.print("No. of eraser:");
    int f = src.nextInt();

    Float bill = (a * d) + (b * e) + (c * f);
    System.out.print("Total Bill = " + bill);

    Float gst = (bill*18)/100; 
    System.out.print("Total Bill with GST: "+ gst);

    src.close();

    }
}