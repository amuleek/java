public class ArithematicMain {

    public static int getIntegerSum (int i, int j) {
        return i + j;
    }

    public static int multiplyInteger (int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println("10 + 20 = " + getIntegerSum(10, 20));
        System.out.println("20 x 40 = " + multiplyInteger(20, 40));
    }
}
