/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 10: Remove Duplicates From a Sorted Array In-Place
 * 
 * TASK:
 * A retail system stores product IDs in a sorted array, but a data import introduced consecutive duplicate
 * IDs that must be cleaned before use. Input is a sorted array (ascending) that may contain consecutive
 * duplicates. Implement removeDuplicates(nums) that modifies the array in place so each unique value
 * appears once, in its original relative order, and returns the count of unique values. Your solution should
 * not use a second array of comparable size to the input; state the additional space complexity of your
 * approach and why it qualifies as in-place.
 * 
 * COMPLEXITY & IN-PLACE QUALIFICATION:
 * - Time Complexity: O(n) single pass with two pointers.
 * - Additional Space Complexity: O(1) auxiliary space beyond a single pointer variable.
 * - Why it qualifies as in-place:
 *   An algorithm is in-place if it transforms the input data structure without using extra memory proportional
 *   to the input size (O(1) extra space). Here, unique elements overwrite duplicates directly inside the existing
 *   nums[] buffer using a write pointer, never allocating another array or buffer.
 */
public class Problem10_RemoveDuplicatesSortedArray {

    /**
     * Removes duplicates from a sorted array in-place.
     *
     * @param nums sorted array with possible consecutive duplicates
     * @return number of unique elements (length of clean prefix)
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // writeIndex tracks the position where the next unique element should be written
        int writeIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            // If current element is different from the last written unique element
            if (nums[i] != nums[writeIndex - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        return writeIndex;
    }

    /**
     * Helper to print subarray nums[0..length-1]
     */
    public static String subarrayToString(int[] nums, int length) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(nums[i]);
            if (i < length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Case ---");
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        System.out.println("Original array: " + subarrayToString(nums, nums.length));
        int k = removeDuplicates(nums);
        System.out.println("length = " + k);
        System.out.println("nums[0.." + (k - 1) + "] = " + subarrayToString(nums, k)); // Expected: [1, 2, 3, 4, 5]

        System.out.println("\n--- Custom Test Case 1 (All Identical Elements) ---");
        int[] numsAllSame = {7, 7, 7, 7};
        int kSame = removeDuplicates(numsAllSame);
        System.out.println("length = " + kSame + ", prefix = " + subarrayToString(numsAllSame, kSame)); // Expected: length = 1, [7]

        System.out.println("\n--- Custom Test Case 2 (Already Distinct) ---");
        int[] numsDistinct = {10, 20, 30, 40};
        int kDistinct = removeDuplicates(numsDistinct);
        System.out.println("length = " + kDistinct + ", prefix = " + subarrayToString(numsDistinct, kDistinct)); // Expected: length = 4, [10, 20, 30, 40]
    }
}
