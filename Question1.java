/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C · SORTING ALGORITHMS
 * 
 * Problem 1: The Height Line-Up
 * 
 * TASK:
 * Students line up for the class photo and the photographer arranges them from shortest to tallest by only
 * swapping two students standing next to each other. Write a method lineUp(int[] heights) that sorts the
 * array this way and prints the whole line after every sweep from left to right. If a sweep makes no swap at
 * all, the line is already in order: print that sweep and stop.
 */
public class Question1 {

    /**
     * Sorts the heights array in ascending order using Bubble Sort.
     * Prints the state of the line after every sweep from left to right.
     * Terminates early if a sweep results in no swaps.
     *
     * @param heights array of student heights
     */
    public static void lineUp(int[] heights) {
        if (heights == null || heights.length <= 1) {
            if (heights != null && heights.length == 1) {
                System.out.println("Pass 1: " + arrayToString(heights));
            }
            return;
        }

        int n = heights.length;
        for (int pass = 1; pass < n; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + arrayToString(heights));
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Helper method to convert an int array to string format "[e1, e2, ...]" without using Arrays.toString.
     */
    public static String arrayToString(int[] arr) {
        if (arr == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Input 1 ---");
        int[] heights1 = {4, 2, 5, 1};
        System.out.println("Original: " + arrayToString(heights1));
        lineUp(heights1);

        System.out.println("\n--- Sample Input 2 ---");
        int[] heights2 = {1, 3, 2, 4};
        System.out.println("Original: " + arrayToString(heights2));
        lineUp(heights2);

        System.out.println("\n--- Custom Test Input ---");
        int[] heightsCustom = {165, 150, 180, 172, 160};
        System.out.println("Original: " + arrayToString(heightsCustom));
        lineUp(heightsCustom);
    }
}
