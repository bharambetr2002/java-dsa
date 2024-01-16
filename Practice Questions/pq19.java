//income tax calculator

import java.util.Scanner;

public class pq19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Your Salary in Numbers : ");
        int a = scn.nextInt();
        scn.close();

        if(a<500000){
            System.out.println("Congratulations you are Tax Free");
        }
        else if(a>= 500000 && a<1000000){
            System.out.println("You come under the Tax category with 20% of your total income which is: " + ((a*20)/100) + "rs of your income " + a);
        }
        else{
            System.out.println("You come under the Tax category with 30% of your total income which is: " + ((a*30)/100) + "rs of your income " + a);
        }

    }
}
