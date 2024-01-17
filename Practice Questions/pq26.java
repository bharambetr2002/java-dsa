// create a calculator + - * / %

import java.util.Scanner;

public class pq26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input Number 1:");
        int a = scn.nextInt();
        System.out.println("Input Number 2:");
        int b = scn.nextInt();
        System.out.println("Enter Operation to perform:");
        char ch = scn.next().charAt(0);
        scn.close();

        switch (ch) {
            case '+': System.out.println(a + b);
                break;
            case '-': System.out.println(a - b);
                break;
            case '*': System.out.println(a * b);
                break;
            case '/': System.out.println(a / b);
                break; 
            case '%': System.out.println(a % b);
                break; 
            default:
                break;
        }
    }
}
