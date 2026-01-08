package pp84;

import java.util.ArrayList;
import java.util.List;

public class EightQueens {
    public static final int N = 8;

    public List<int[]> solveAll() {
        List<int[]> solutions = new ArrayList<int[]>();
        int[] positions = new int[N];
        placeQueen(0, positions, solutions);
        return solutions;
    }

    private void placeQueen(int col, int[] positions, List<int[]> solutions) {
        if (col == N) {
            int[] sol = new int[N];
            for (int i = 0; i < N; i++) {
                sol[i] = positions[i];
            }
            solutions.add(sol);
            return;
        }
        for (int row = 0; row < N; row++) {
            if (isSafe(row, col, positions)) {
                positions[col] = row;
                placeQueen(col + 1, positions, solutions);
            }
        }
    }

    private boolean isSafe(int row, int col, int[] positions) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = positions[prevCol];
            // Same row
            if (prevRow == row) return false;
            // Same diagonal
            if (Math.abs(prevRow - row) == Math.abs(prevCol - col)) return false;
        }
        return true;
    }

    public static void printBoard(int[] solution) {
        int n = solution.length;
        System.out.println();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (solution[c] == r) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
