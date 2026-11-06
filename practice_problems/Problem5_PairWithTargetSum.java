import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 5: Pair With Target Sum (Unsorted)
 * 
 * TASK:
 * Given a list of integers and a target value, determine whether any two distinct elements in the list add up
 * to the target. Input is an array of integers (may include negatives and duplicates) and a target integer, in
 * no particular order. Implement hasPairWithSum(nums, target) returning true if two distinct elements
 * sum to target, false otherwise. Discuss at least two approaches with different time/space trade-offs, and
 * state the complexity of each.
 * 
 * APPROACHES & TRADE-OFFS:
 * 1. Approach 1 (Hash Set - Optimal Time):
 *    - Store visited numbers in a HashSet. For each element x, check if (target - x) is in the set.
 *    - Time Complexity: O(n) average time.
 *    - Space Complexity: O(n) auxiliary space.
 * 
 * 2. Approach 2 (Sorting + Two Pointers - Space Saver):
 *    - Sort a copy of the array, then use two pointers starting at both ends moving inwards.
 *    - Time Complexity: O(n log n) due to sorting.
 *    - Space Complexity: O(1) auxiliary space (or O(n) if preserving original array order).
 * 
 * 3. Approach 3 (Brute Force):
 *    - Check all pairs (i, j) with nested loops.
 *    - Time Complexity: O(n^2).
 *    - Space Complexity: O(1).
 */
public class Problem5_PairWithTargetSum {

    /**
     * Checks if two distinct elements sum to target using HashSet (O(n) time, O(n) space).
     *
     * @param nums array of integers
     * @param target target sum
     * @return true if pair exists, false otherwise
     */
    public static boolean hasPairWithSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    /**
     * Alternative approach using Sorting + Two Pointers (O(n log n) time, O(1) extra space).
     */
    public static boolean hasPairWithSumSorting(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        int[] copy = nums.clone();
        Arrays.sort(copy);

        int left = 0;
        int right = copy.length - 1;

        while (left < right) {
            int sum = copy[left] + copy[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Cases ---");
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("nums = [2, 7, 11, 15], target = 9: " + hasPairWithSum(nums1, target1)); // Expected: true (2 + 7 = 9)

        int[] nums2 = {3, 4, 6};
        int target2 = 20;
        System.out.println("nums = [3, 4, 6], target = 20: " + hasPairWithSum(nums2, target2)); // Expected: false

        System.out.println("\n--- Custom Test Cases (Negative numbers & Duplicates) ---");
        int[] nums3 = {-5, 12, 3, -2, 8};
        int target3 = -7;
        System.out.println("nums = [-5, 12, 3, -2, 8], target = -7: " + hasPairWithSum(nums3, target3)); // Expected: true (-5 + -2 = -7)

        int[] nums4 = {5, 5};
        int target4 = 10;
        System.out.println("nums = [5, 5], target = 10: " + hasPairWithSum(nums4, target4)); // Expected: true (5 + 5 = 10)
    }
}
