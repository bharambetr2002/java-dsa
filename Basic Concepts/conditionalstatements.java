// conditional statements

import java.util.Scanner;

public class conditionalstatements {    
    public static void main(String[] args) {

    Scanner src = new Scanner(System.in);
       
    int age = src.nextInt();

    src.close();

// if else statement 

    if(age >= 18){
        System.out.println("You are adult");
    }
    else{
        System.out.println("You are kid");
        }
    }
}

