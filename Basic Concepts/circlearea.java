// Area of circle using java

import java.util.Scanner;

public class circlearea {
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float area = 3.14f * r * r ;

        System.out.println(area);

        scn.close();
    }
}
