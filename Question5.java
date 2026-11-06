/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C · SORTING ALGORITHMS
 * 
 * Problem 5: The Dice Throw Tally
 * 
 * TASK:
 * In a maths activity, a student throws a die several times and writes down each result (a number from 1 to
 * 6). Write a method diceSort(int[] rolls) that first counts how many times each number from 1 to 6
 * appeared, prints these counts, and then uses the counts to build and return the results in increasing
 * order. Do not compare two throws with each other.
 */
public class Question5 {

    /**
     * Sorts the dice rolls in increasing order using Counting Sort (values 1 through 6).
     * First counts occurrences without comparing throws with each other,
     * prints the counts, and constructs the sorted array from the tally.
     *
     * @param rolls array of dice rolls (values 1 to 6)
     * @return sorted array of rolls
     */
    public static int[] diceSort(int[] rolls) {
        if (rolls == null) {
            return new int[0];
        }

        // Frequency array of size 7 to store counts for values 1 to 6
        int[] count = new int[7];
        for (int roll : rolls) {
            if (roll >= 1 && roll <= 6) {
                count[roll]++;
            }
        }

        // Print counts in format: Counts: 1:2 2:1 3:0 4:3 5:0 6:1
        StringBuilder countsBuilder = new StringBuilder("Counts:");
        for (int v = 1; v <= 6; v++) {
            countsBuilder.append(" ").append(v).append(":").append(count[v]);
        }
        System.out.println(countsBuilder.toString());

        // Reconstruct sorted array
        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int v = 1; v <= 6; v++) {
            for (int c = 0; c < count[v]; c++) {
                sorted[index++] = v;
            }
        }

        return sorted;
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
        System.out.println("--- Sample Input ---");
        int[] rolls = {4, 1, 6, 4, 2, 1, 4};
        System.out.println("Original rolls: " + arrayToString(rolls));
        int[] sorted = diceSort(rolls);
        System.out.println("Sorted: " + arrayToString(sorted));

        System.out.println("\n--- Custom Test Input ---");
        int[] rollsCustom = {6, 6, 5, 3, 2, 1, 3, 5, 2};
        System.out.println("Original rolls: " + arrayToString(rollsCustom));
        int[] sortedCustom = diceSort(rollsCustom);
        System.out.println("Sorted: " + arrayToString(sortedCustom));
    }
}
