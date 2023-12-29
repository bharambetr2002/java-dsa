//Input types in java using scanner class with all type included

import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String input = scn.next(); // next can be used to take input of a single word or till space
        System.out.println(input);

        String name = scn.nextLine(); // nextLine can be used to take input of a single line or till enter
        System.out.println(name);

        int number = scn.nextInt(); // nextInt can be used to take input of a single integer
        System.out.println(number);

        float price = scn.nextFloat(); // nextFloat can be used to take input of a single decimal
        System.out.println(price);

        byte b = scn.nextByte(); // nextByte can be used to take input of a single byte
        System.out.println(b);

        double d = scn.nextDouble(); // nextDouble can be used to take input of a single double
        System.out.println(d);

        boolean var = scn.nextBoolean(); // nextBoolean can be used to take input of a single boolean
        System.out.println(var);

        short s = scn.nextShort(); // nextShort can be used to take input of a single short
        System.out.println(s);

        long l = scn.nextLong(); // nextLong can be used to take input of a single long
        System.out.println(l);

    }
}


