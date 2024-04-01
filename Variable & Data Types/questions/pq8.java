//Enter cost of 3 items from the user (using float data type )- a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class pq8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.println("Price of Pencil : ");
        float a = scn.nextFloat();
        System.err.println("Price of Pen : ");
        float b = scn.nextFloat();
        System.err.println("Price of Eraser : ");
        float c = scn.nextFloat();
        System.err.println("No of Pencil Buyed : ");
        int d = scn.nextInt();
        System.err.println("No of Pen Buyed : ");
        int e = scn.nextInt();
        System.err.println("No of Eraser Buyed : ");
        int f = scn.nextInt();
        scn.close();
        float totalprice = (a * d) + (b * e) + (c * f);
        float gst = (totalprice * 18) / 100;
        System.err
                .println("Total Price without GST : " + totalprice + "rs/n" + "Total Price with GST : "
                        + (totalprice + gst) + "rs");
    }
}
