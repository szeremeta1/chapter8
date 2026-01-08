package pp84;

import java.util.List;

public class EightQueensDriver {
    public static void main(String[] args) {
        EightQueens solver = new EightQueens();
        System.out.println("PP 8.4 — Eight Queens (Recursive Backtracking)\n");
        List<int[]> solutions = solver.solveAll();

        System.out.println("Total solutions: " + solutions.size());
        System.out.println();

        int show = Math.min(3, solutions.size());
        for (int i = 0; i < show; i++) {
            System.out.println("Solution #" + (i + 1) + ":");
            EightQueens.printBoard(solutions.get(i));
        }
    }
}
