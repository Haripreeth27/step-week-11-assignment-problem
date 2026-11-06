/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 6: Best Single Trade Profit
 * 
 * TASK:
 * Given an array where each element represents a stock's price on a given day (in order), find the
 * maximum profit achievable by buying on one day and selling on a later day. Prices are given in
 * chronological order as an array of non-negative integers. You must buy before you sell (a single buy and a
 * single sell). Implement maxProfit(prices) that returns the maximum achievable profit, or 0 if no profit is
 * possible. State the time complexity of a solution that scans the array only once, versus one that checks
 * every pair of days, and explain why one is preferable at scale.
 * 
 * COMPLEXITY COMPARISON & SCALABILITY:
 * - Single-Pass Solution (Optimal):
 *   Tracks the minimum price seen so far while updating maximum profit.
 *   Time Complexity: O(n) single pass.
 *   Space Complexity: O(1) constant auxiliary space.
 * 
 * - Brute-Force Solution (Checking every pair):
 *   Compares every pair (i, j) where j > i.
 *   Time Complexity: O(n^2).
 *   Space Complexity: O(1).
 * 
 * - Why Single-Pass is Preferable at Scale:
 *   For an array of 100,000 trading days:
 *   - O(n) requires ~10^5 operations (executes in milliseconds).
 *   - O(n^2) requires ~(10^5)^2 / 2 = 5 * 10^9 operations (takes tens of seconds or minutes and crashes batch limits).
 *   Hence, linear time O(n) is fundamentally necessary for production workloads.
 */
public class Problem6_BestSingleTradeProfit {

    /**
     * Finds maximum profit achievable with a single buy and sell transaction.
     *
     * @param prices chronological array of daily stock prices
     * @return maximum profit, or 0 if no profit possible
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int currentProfit = price - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Cases ---");
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("prices = [7, 1, 5, 3, 6, 4]: " + maxProfit(prices1)); // Expected: 5 (buy at 1, sell at 6)

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("prices = [7, 6, 4, 3, 1]: " + maxProfit(prices2)); // Expected: 0

        System.out.println("\n--- Custom Test Cases ---");
        int[] prices3 = {2, 4, 1, 10, 3};
        System.out.println("prices = [2, 4, 1, 10, 3]: " + maxProfit(prices3)); // Expected: 9 (buy at 1, sell at 10)

        int[] prices4 = {5};
        System.out.println("Single day price [5]: " + maxProfit(prices4)); // Expected: 0
    }
}
