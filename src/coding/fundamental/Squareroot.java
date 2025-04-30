package coding.fundamental;

public class Squareroot {

    public static double findSqrt(double x) {
        if (x < 2)
            return x;

        double y = x;
        double z = (y + (x / y)) / 2;

        while (Math.abs(y - z) >= 0.00001) {
            y = z;
            z = (y + (x / y)) / 2;
        }
        return z;
    }

    public static void main(String[] args) {
        double n = 3;
        double ans = findSqrt(n);
        System.out.println(String.format("%.5f", ans) + " is the Sqrt of 3");

    }
}
