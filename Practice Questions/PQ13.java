//Reverse the given number

public class PQ13 {
    public static void main(String[] args) {
        int a = 29092002;
        int reverse = 0;
        while(a>0){
            int lastdigit = a%10;
            reverse = (reverse*10)+lastdigit;
            a = a/10;
        }
        System.out.println(reverse);
    }
}