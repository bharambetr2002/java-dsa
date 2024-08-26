// Print Pattern the star pattern where no of stars = no. of lines

public class PQ1 {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
