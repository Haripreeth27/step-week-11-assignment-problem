/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 2: Warehouse Bin Grid Scan
 * 
 * TASK:
 * A retail warehouse stores its floor layout as a grid, where each cell represents a storage bin holding an
 * integer count of items (0 means empty). Management wants the total number of items and the
 * coordinates of the bin holding the most items. The layout is given as a grid of m rows and n columns of
 * non-negative integers. Implement a function warehouseSummary(grid) that returns the total item count
 * and the (row, col) of the maximum bin. If multiple bins tie for the maximum, return the coordinates of
 * the first one encountered scanning row by row, left to right. State the time complexity in terms of m and
 * n, and the additional space complexity beyond the input grid itself.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(m * n) since we must inspect each of the m * n cells once.
 * - Auxiliary Space Complexity: O(1) beyond the input grid, requiring only a few primitive variables
 *   for running total, maximum value, and coordinate pointers.
 */
public class Problem2_WarehouseBinGridScan {

    public static class SummaryResult {
        public long total;
        public int maxRow;
        public int maxCol;
        public int maxValue;

        public SummaryResult(long total, int maxRow, int maxCol, int maxValue) {
            this.total = total;
            this.maxRow = maxRow;
            this.maxCol = maxCol;
            this.maxValue = maxValue;
        }

        @Override
        public String toString() {
            return "total = " + total + ", maxCoordinate = (" + maxRow + ", " + maxCol + ")";
        }
    }

    /**
     * Scans the m x n grid row by row, calculating total items and the coordinate of the maximum bin.
     *
     * @param grid 2D array of non-negative integers
     * @return SummaryResult containing total items and (row, col) coordinates of max bin
     */
    public static SummaryResult warehouseSummary(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return new SummaryResult(0, -1, -1, 0);
        }

        int m = grid.length;
        int n = grid[0].length;
        long total = 0;
        int maxVal = -1;
        int maxRow = 0;
        int maxCol = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int val = grid[r][c];
                total += val;
                // Strict greater-than ensures the first encountered in row-major order is retained on ties
                if (val > maxVal) {
                    maxVal = val;
                    maxRow = r;
                    maxCol = c;
                }
            }
        }

        return new SummaryResult(total, maxRow, maxCol, maxVal);
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Case ---");
        int[][] grid = {
            {4, 9, 2},
            {7, 1, 6},
            {3, 12, 5}
        };
        SummaryResult result = warehouseSummary(grid);
        System.out.println(result);

        System.out.println("\n--- Custom Test Case (Tie for Maximum) ---");
        int[][] gridTie = {
            {5, 10, 3},
            {10, 2, 8},
            {1, 4, 10}
        };
        SummaryResult resultTie = warehouseSummary(gridTie);
        // First occurrence of 10 is at (0, 1)
        System.out.println(resultTie + " (First max 10 at (0,1))");
    }
}
