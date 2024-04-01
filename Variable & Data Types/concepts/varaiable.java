// Basic Understanding of variables and data types 

public class varaiable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Tony Stark";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        // change value of a
        a = 50;
        System.out.println(a);

        // change value of b = a
        b = a;
        System.out.println(b);

        // understanding data types

        byte c = 8; // size = 256
        System.err.println(c);
        char ch = 'A'; // single character
        System.out.println(ch);
        boolean var = true; // to check condition only ture or false
        System.out.println(var);
        float price = 10.345f;
        System.out.println(price);
        int number = 25; // to store whole value
        // long
        // double
        System.out.println(number);
    }
}
