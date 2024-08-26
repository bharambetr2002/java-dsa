// Print Pattern the inverted star pattern where no of stars = no. of lines

public class PQ2 {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1; line <= n; line++) {

            for (int star = 1; star <= 4 - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
