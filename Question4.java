/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C · SORTING ALGORITHMS
 * 
 * Problem 4: Is the Queue in Order?
 * 
 * TASK:
 * Students in the fee counter queue are supposed to stand in increasing order of their token numbers.
 * Equal token numbers next to each other are allowed. Write a method firstBreak(int[] tokens) that returns
 * the position (index) of the first student whose token number is smaller than the token of the student just
 * before them, or -1 if the whole queue is in order. An empty queue or a queue of one student is always in
 * order.
 */
public class Question4 {

    /**
     * Checks if the tokens array is in non-decreasing order.
     * Returns the index of the first element that is strictly smaller than its predecessor.
     * Returns -1 if the entire array is in non-decreasing order or has fewer than 2 elements.
     *
     * @param tokens array of student token numbers
     * @return index of first out-of-order element, or -1 if fully ordered
     */
    public static int firstBreak(int[] tokens) {
        if (tokens == null || tokens.length <= 1) {
            return -1;
        }

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }

        return -1;
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
        int[] tokens1 = {3, 5, 5, 8, 6, 9};
        System.out.println("Tokens: " + arrayToString(tokens1));
        int breakIndex1 = firstBreak(tokens1);
        if (breakIndex1 != -1) {
            System.out.println(breakIndex1 + " (" + tokens1[breakIndex1] + " comes after " + tokens1[breakIndex1 - 1] + ")");
        } else {
            System.out.println(breakIndex1);
        }

        System.out.println("\n--- Sample Input 2 ---");
        int[] tokens2 = {1, 2, 2, 7};
        System.out.println("Tokens: " + arrayToString(tokens2));
        int breakIndex2 = firstBreak(tokens2);
        System.out.println(breakIndex2);

        System.out.println("\n--- Custom Test Input 1 (Out of order at index 2) ---");
        int[] tokensCustom1 = {10, 20, 15, 25, 30};
        System.out.println("Tokens: " + arrayToString(tokensCustom1));
        int customIndex1 = firstBreak(tokensCustom1);
        if (customIndex1 != -1) {
            System.out.println(customIndex1 + " (" + tokensCustom1[customIndex1] + " comes after " + tokensCustom1[customIndex1 - 1] + ")");
        } else {
            System.out.println(customIndex1);
        }

        System.out.println("\n--- Custom Test Input 2 (Single element) ---");
        int[] tokensCustom2 = {42};
        System.out.println("Tokens: " + arrayToString(tokensCustom2));
        System.out.println(firstBreak(tokensCustom2));
    }
}
