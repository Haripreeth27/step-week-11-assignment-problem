import java.util.ArrayList;
import java.util.List;

/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 8: Spiral Order Traversal
 * 
 * TASK:
 * Given a 2D grid of integers, return all elements in spiral order, starting from the top-left corner and
 * moving clockwise inward. The grid has m rows and n columns and is not necessarily square. Implement
 * spiralOrder(grid) returning a single flat list of the elements in spiral order. State the time complexity in
 * terms of m and n, and the space complexity of your output (excluding the input grid).
 * 
 * COMPLEXITY:
 * - Time Complexity: O(m * n) where m is the number of rows and n is the number of columns.
 *   Every cell is traversed exactly once.
 * - Space Complexity: O(m * n) to store the flattened output list (or O(1) auxiliary space beyond the output).
 */
public class Problem8_SpiralOrderTraversal {

    /**
     * Traverses a 2D matrix clockwise in spiral order.
     *
     * @param grid 2D array of dimensions m x n
     * @return List of integers in clockwise spiral sequence
     */
    public static List<Integer> spiralOrder(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return result;
        }

        int top = 0;
        int bottom = grid.length - 1;
        int left = 0;
        int right = grid[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Traverse from left to right along top boundary
            for (int col = left; col <= right; col++) {
                result.add(grid[top][col]);
            }
            top++;

            // 2. Traverse from top to bottom along right boundary
            for (int row = top; row <= bottom; row++) {
                result.add(grid[row][right]);
            }
            right--;

            // 3. Traverse from right to left along bottom boundary (if still within bounds)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(grid[bottom][col]);
                }
                bottom--;
            }

            // 4. Traverse from bottom to top along left boundary (if still within bounds)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(grid[row][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Case (3x3) ---");
        int[][] grid1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Spiral Order: " + spiralOrder(grid1)); // Expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]

        System.out.println("\n--- Custom Test Case (Non-Square 2x4) ---");
        int[][] grid2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        System.out.println("Spiral Order: " + spiralOrder(grid2)); // Expected: [1, 2, 3, 4, 8, 7, 6, 5]

        System.out.println("\n--- Custom Test Case (Single Column 3x1) ---");
        int[][] grid3 = {
            {10},
            {20},
            {30}
        };
        System.out.println("Spiral Order: " + spiralOrder(grid3)); // Expected: [10, 20, 30]
    }
}
