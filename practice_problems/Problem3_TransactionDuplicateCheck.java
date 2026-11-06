import java.util.HashSet;
import java.util.Set;

/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 3: Transaction Duplicate Check
 * 
 * TASK:
 * A payments platform processes a daily batch of transaction ID strings. Before finalizing the batch, it must
 * check whether any transaction ID appears more than once (indicating a processing error). Input is a list of
 * transaction ID strings, which may contain zero or more duplicates. Implement a function
 * hasDuplicate(transactionIds) that returns true if any ID appears more than once, false otherwise. The
 * platform processes millions of transactions nightly and this check is time-sensitive — minimizing runtime
 * is the priority, even at the cost of extra memory. Describe one alternative approach that uses less
 * memory but takes longer, and explain the trade-off. State the time and space complexity of your chosen
 * solution.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(n) average time using a Hash Set for O(1) average insertions/lookups.
 * - Auxiliary Space Complexity: O(n) to store seen transaction IDs in the set.
 * 
 * ALTERNATIVE APPROACH & TRADE-OFF:
 * - Alternative Approach (In-Place Sorting):
 *   Sort the transaction IDs array in-place (e.g. using HeapSort or QuickSort in O(n log n) time and O(1)
 *   or O(log n) auxiliary space), then make a single linear pass comparing adjacent elements (arr[i] == arr[i-1]).
 * - Trade-off:
 *   The sorting approach saves substantial RAM (avoiding hash table overhead of O(n) references and buckets),
 *   but increases runtime from O(n) to O(n log n). For millions of nightly transactions under time-sensitive SLA,
 *   spending extra memory for O(n) linear performance is the superior design choice.
 */
public class Problem3_TransactionDuplicateCheck {

    /**
     * Checks if any transaction ID appears more than once using a HashSet.
     *
     * @param transactionIds array or list of transaction ID strings
     * @return true if any duplicate exists, false otherwise
     */
    public static boolean hasDuplicate(String[] transactionIds) {
        if (transactionIds == null || transactionIds.length <= 1) {
            return false;
        }

        Set<String> seen = new HashSet<>();
        for (String id : transactionIds) {
            if (!seen.add(id)) {
                return true; // Duplicate found immediately
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Sample Test Cases ---");
        String[] batch1 = {"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"};
        System.out.println("Batch 1: " + hasDuplicate(batch1)); // Expected: true

        String[] batch2 = {"TXN2001", "TXN2002", "TXN2003"};
        System.out.println("Batch 2: " + hasDuplicate(batch2)); // Expected: false

        System.out.println("\n--- Custom Test Cases ---");
        String[] batchEmpty = {};
        System.out.println("Empty batch: " + hasDuplicate(batchEmpty)); // Expected: false

        String[] batchSingle = {"TXN9999"};
        System.out.println("Single item batch: " + hasDuplicate(batchSingle)); // Expected: false

        String[] batchDuplicatesAtEnds = {"TXN5000", "TXN5001", "TXN5002", "TXN5000"};
        System.out.println("Duplicates at ends: " + hasDuplicate(batchDuplicatesAtEnds)); // Expected: true
    }
}
