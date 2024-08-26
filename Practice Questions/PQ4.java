//Print Charachter Pattern     

public class PQ4 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int a = 1; a <= line; a++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
