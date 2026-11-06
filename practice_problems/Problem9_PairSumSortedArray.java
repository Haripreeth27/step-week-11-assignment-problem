/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 9: Pair Sum in a Sorted Array
 * 
 * TASK:
 * A finance app needs to check whether two account balances in an already-sorted list sum exactly to a
 * target reconciliation amount. The input array is sorted in ascending order and may contain negative and
 * positive integers. Implement pairSumSorted(nums, target) returning a matching pair of values if found, or
 * an indicator that no pair exists. Because the array is already sorted, your solution should avoid checking
 * every possible pair; state the time and space complexity achieved. Compare this complexity to a solution
 * that ignores the sorted property entirely.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(n) achieved using the Two-Pointer technique (one pass with left and right pointers).
 * - Auxiliary Space Complexity: O(1) constant extra memory.
 * 
 * COMPARISON TO IGNORING SORTED PROPERTY:
 * - If ignoring sorted order:
 *   - Brute-Force: Compares every pair with nested loops in O(n^2) time and O(1) space.
 *   - Hash Set: Uses extra O(n) memory to achieve O(n) time.
 * - Exploiting the sorted order with Two Pointers gives the optimal combination: O(n) time AND O(1) space,
 *   which is strictly superior to the Hash Set approach (saves memory) and Brute Force (vastly faster).
 */
public class Problem9_PairSumSortedArray {

    public static class PairResult {
        public int first;
        public int second;

        public PairResult(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    /**
     * Finds two elements in a sorted array that sum to target using two pointers.
     *
     * @param nums sorted array of integers (can include negative, zero, positive)
     * @param target target sum
     * @return PairResult containing the two numbers, or null if no pair exists
     */
    public static PairResult pairSumSorted(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new PairResult(nums[left], nums[right]);
            } else if (sum < target) {
                left++; // Increase sum by moving left pointer rightwards
            } else {
                right--; // Decrease sum by moving right pointer leftwards
            }
        }

        return null; // No pair found
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Cases ---");
        int[] nums1 = {-4, -1, 0, 3, 5, 9};
        PairResult res1 = pairSumSorted(nums1, 4);
        System.out.println("nums = [-4, -1, 0, 3, 5, 9], target = 4: " + (res1 != null ? res1 : "Not Found")); // Expected: (-1, 5)

        int[] nums2 = {1, 2, 3};
        PairResult res2 = pairSumSorted(nums2, 100);
        System.out.println("nums = [1, 2, 3], target = 100: " + (res2 != null ? res2 : "Not Found")); // Expected: Not Found

        System.out.println("\n--- Custom Test Cases ---");
        int[] nums3 = {-10, -5, -2, 0, 4, 7, 12};
        PairResult res3 = pairSumSorted(nums3, 2);
        System.out.println("nums = [-10, -5, -2, 0, 4, 7, 12], target = 2: " + (res3 != null ? res3 : "Not Found")); // Expected: (-2, 4) or (-5, 7)
    }
}
