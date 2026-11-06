/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C · SORTING ALGORITHMS
 * 
 * Problem 2: The Prize Table
 * 
 * TASK:
 * For the prize distribution, the teacher writes the marks on the board from highest to lowest. In each
 * round she finds the highest mark among the ones not yet placed and swaps it into the next position.
 * Write a method prizeTable(int[] marks) that sorts the marks in descending order this way and returns
 * how many swaps were actually made. Do not count a round in which the highest mark is already in the
 * right place.
 */
public class Question2 {

    /**
     * Sorts the marks array in descending order using Selection Sort.
     * Swaps only if the highest mark in the remaining range is not already at position i.
     *
     * @param marks array of marks
     * @return the number of swaps made
     */
    public static int prizeTable(int[] marks) {
        if (marks == null || marks.length <= 1) {
            return 0;
        }

        int swaps = 0;
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }

        return swaps;
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
        int[] marks1 = {45, 90, 60, 75};
        System.out.println("Original: " + arrayToString(marks1));
        int swaps1 = prizeTable(marks1);
        System.out.println(arrayToString(marks1) + " swaps = " + swaps1);

        System.out.println("\n--- Sample Input 2 ---");
        int[] marks2 = {80, 70, 60};
        System.out.println("Original: " + arrayToString(marks2));
        int swaps2 = prizeTable(marks2);
        System.out.println(arrayToString(marks2) + " swaps = " + swaps2);

        System.out.println("\n--- Custom Test Input ---");
        int[] marksCustom = {55, 95, 82, 95, 40, 78};
        System.out.println("Original: " + arrayToString(marksCustom));
        int swapsCustom = prizeTable(marksCustom);
        System.out.println(arrayToString(marksCustom) + " swaps = " + swapsCustom);
    }
}
