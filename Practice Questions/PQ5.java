//find the product of a and b

// import java.util.Scanner;

public class PQ5 {
    // public static void product(){
    // Scanner scn = new Scanner(System.in);
    // int a = scn.nextInt();
    // int b = scn.nextInt();
    // int product = a*b;
    // System.out.println("Product is " + product);
    // scn.close();
    // }
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int prod = multiply(20, 20);
        System.out.println(prod);
    }
}
