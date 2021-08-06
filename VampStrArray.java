import java.util.*;

public class VampStrArray {
    private static final int start = 11;
    private static final int end = 99;

    int a, b, product;
    String[] resultLeft, resultRight;

    public void count() {
        int bottom = (start - 1) * (end + 1) - 1;
        for (a = start; a <= end; ++a) {
            for (b = end; b >= a; --b) {
                product = a * b;
                if (product <= bottom) {
                    break;
                }
                resultLeft = (String.valueOf(a) + String.valueOf(b)).split("");
                resultRight = String.valueOf(product).split("");
                Arrays.sort(resultLeft);
                Arrays.sort(resultRight);
                if (Arrays.equals(resultLeft, resultRight)) {
                    System.out.println(a + " * " + b + " = " + product);
                }
            }
        }
    }

    public static void main(String[] args) {
        VampStrArray run = new VampStrArray();
        run.count();
    }
}
