package pp81;

public class DivisorCalc {
    public static int gcd(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("gcd is defined for positive integers only");
        }
        return gcdRecursive(num1, num2);
    }

    private static int gcdRecursive(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcdRecursive(num2, num1 % num2);
    }
}
