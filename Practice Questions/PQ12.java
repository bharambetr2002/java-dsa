///print a reverse of a number

public class PQ12 {
      public static void main(String[] args) {
        int a = 29092002;
        int reverse = 0;
        while (a>0){
            reverse = a%10;
            System.out.print(reverse);
            a = a/10;
        }
        System.out.println();
      }
}
