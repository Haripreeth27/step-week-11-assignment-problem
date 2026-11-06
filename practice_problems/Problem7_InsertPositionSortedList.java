/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 7: Insert Position in a Sorted List
 * 
 * TASK:
 * Given a sorted array of distinct integers and a target value, find the index where the target is found, or
 * the index where it would be inserted to keep the array sorted. The array is sorted in ascending order with
 * no duplicates. Implement searchInsertPosition(nums, target) returning the index of target if present, or
 * the index it should be inserted at if not present. Your approach should scale well for very large arrays
 * where this lookup happens frequently. State the time complexity of your solution and why it is
 * appropriate here.
 * 
 * COMPLEXITY & JUSTIFICATION:
 * - Time Complexity: O(log n) using Binary Search.
 * - Auxiliary Space Complexity: O(1) constant memory.
 * - Justification: Since the input array is already sorted and distinct, Binary Search halves the
 *   search space on each comparison. For an array of 1,000,000 elements, it takes at most ~20 operations
 *   compared to up to 1,000,000 operations for linear scan, making it ideal for frequent queries.
 */
public class Problem7_InsertPositionSortedList {

    /**
     * Finds index of target or its sorted insertion point.
     *
     * @param nums sorted array of distinct integers
     * @param target value to search or insert
     * @return target index or insertion position
     */
    public static int searchInsertPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // When the loop ends without finding target, 'left' points to the insertion index
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        System.out.println("--- Sample Test Cases ---");
        System.out.println("target = 5 (Present): " + searchInsertPosition(nums, 5)); // Expected: 2
        System.out.println("target = 2 (Insert):  " + searchInsertPosition(nums, 2)); // Expected: 1

        System.out.println("\n--- Additional Test Cases ---");
        System.out.println("target = 7 (Insert at end):   " + searchInsertPosition(nums, 7)); // Expected: 4
        System.out.println("target = 0 (Insert at start): " + searchInsertPosition(nums, 0)); // Expected: 0
    }
}
