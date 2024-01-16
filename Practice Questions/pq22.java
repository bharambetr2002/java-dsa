// score card : pass fail

import java.util.Scanner;

public class pq22 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Your Marks");
        int marks = scn.nextInt(); 
        scn.close();

        // if(marks>=33){
        //     System.out.println("You are Passed");
        // }else{
        //     System.out.println("You are Fail");
        // }

        String result = (marks>=33)? "Pass" : "Fail"; 
        System.out.println("You are " + result);
    }
}
