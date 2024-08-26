// print the factorial of number n

public class PQ6 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = i * f;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);
    }
}
