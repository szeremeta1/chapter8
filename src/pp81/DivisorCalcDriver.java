package pp81;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorCalcDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PP 8.1 — Euclid's Algorithm (Recursive GCD)\n");
        try {
            System.out.print("Enter first positive integer: ");
            int a = scanner.nextInt();
            System.out.print("Enter second positive integer: ");
            int b = scanner.nextInt();
            int g = DivisorCalc.gcd(a, b);
            System.out.println("gcd(" + a + ", " + b + ") = " + g);
            scanner.close();
        }
    }
}
