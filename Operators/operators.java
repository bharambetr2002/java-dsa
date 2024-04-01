public class operators {
    public static void main(String[] args){
        // arithmetic operators : binary
        
        int a = 10;
        int b = 20;
        System.out.println("a:"+ a);
        System.out.println("b:" + b);

        int add = a + b;
        int substraction = a - b; 
        int multiplication = a * b; 
        int division = a / b ; 
        int modulo = a % b ;

        System.out.println("addition (+) = " + add );
        System.out.println("substraction (-) = " + substraction);
        System.out.println("multiplication (*) = " + multiplication );
        System.out.println("division (/) = " + division );
        System.out.println("modulo(reminder) (%) = " + modulo );

        // arithmetic operators : unary

        int c = ++a;
        System.out.println("Uniary (++) =" + c);
        int d = --b;
        System.out.println("Uniary (--) =" + d);

        int e = a++;
        System.out.println("Uniary (++) =" + e);
        int f = b--;
        System.out.println("Uniary (--) =" + f);

        /* relational operators 
        ==      equal to
        !=      not equal to
        >       greater than
        >=      greater than or equal to
        <       less than
        <=      less than or equal to */

        int A = 10;
        int B = 10;
        int C = 20;
        int D = 22;
        
        System.out.println( A == B );
        System.out.println( A == C );
        System.out.println( A != B );
        System.out.println( A != C );      
        System.out.println( A > D );
        System.out.println( A < C );  
         
        System.out.println( A >= C );
        System.out.println( A <= C );

        /* Logical Operators 
        && Conditional-AND
        || Conditional-OR
        ! Logical NOT */

        System.out.println( ( A >= C ) && ( A <= C ) ); //( False && True )
        System.out.println( ( A <= C ) && ( C <= D ) ); //( True && True )

        System.out.println( ( A >= C ) || ( A <= C ) ); //( False || True )
        System.out.println( ( A >= C ) || !( A <= C ) ); //( False || !(True) )

        // ternary operator
        //variable = condition? statement1 : statement2;

        int number = 4;
        
        int value = ((number%2)==0) ? 0 : 1; //0:true:even 1:false:odd
        System.out.println(value);
    }
}
