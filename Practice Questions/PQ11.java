public class PQ11 {
    // convert binary to decimal

    public static void binToDec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastdig = binNum % 10;
            decNum = decNum + (lastdig * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + mynum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(111);
    }
}
