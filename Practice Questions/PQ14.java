public class PQ14 {
    // check if the number is even or not using methods

    public static boolean isEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEven(6));
    }

}
