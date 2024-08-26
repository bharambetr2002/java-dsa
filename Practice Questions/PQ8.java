//check if a number is prime or not 

public class PQ8 {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 2) {
            return true;
        } // corner case
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
}
