import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 4: Employee ID Lookup in an Unsorted Directory
 * 
 * TASK:
 * A company's HR system stores employee records as an unordered list (new hires are appended, no
 * sorting). A manager repeatedly looks up an employee's department by ID throughout the day. Input is a
 * list of (employeeId, department) pairs, in no particular order; queried dozens of times per day, updated
 * only a few times per month. Implement buildLookup(records) to prepare the data for repeated queries,
 * and getDepartment(lookup, employeeId) that returns the department or 'Unknown'. Justify why your
 * approach is appropriate given that queries vastly outnumber updates, and state the time complexity of
 * getDepartment after the lookup is built, plus the space cost of maintaining it.
 * 
 * COMPLEXITY & JUSTIFICATION:
 * - buildLookup Time Complexity: O(n) one-time pre-processing cost to index n records into a hash table.
 * - getDepartment Time Complexity: O(1) average time per lookup query.
 * - Space Cost: O(n) auxiliary space to store key-value mappings in the hash map.
 * - Justification: Since queries occur dozens of times per day while updates occur only a few times a month,
 *   paying the one-time O(n) build cost and O(n) space overhead pays off exponentially by turning every query
 *   into a near-instant O(1) operation compared to scanning through the unordered list in O(n) each time.
 */
public class Problem4_EmployeeIdLookup {

    public static class EmployeeRecord {
        public String employeeId;
        public String department;

        public EmployeeRecord(String employeeId, String department) {
            this.employeeId = employeeId;
            this.department = department;
        }
    }

    /**
     * Builds an efficient key-value lookup structure from an unordered list of records.
     *
     * @param records list of employee records
     * @return Map mapping employee ID to department
     */
    public static Map<String, String> buildLookup(List<EmployeeRecord> records) {
        Map<String, String> lookup = new HashMap<>();
        if (records == null) {
            return lookup;
        }

        for (EmployeeRecord record : records) {
            lookup.put(record.employeeId, record.department);
        }

        return lookup;
    }

    /**
     * Retrieves the department for an employee ID in O(1) average time.
     *
     * @param lookup pre-built employee map
     * @param employeeId the ID to query
     * @return department name if found, or "Unknown"
     */
    public static String getDepartment(Map<String, String> lookup, String employeeId) {
        if (lookup == null || employeeId == null) {
            return "Unknown";
        }
        return lookup.getOrDefault(employeeId, "Unknown");
    }

    public static void main(String[] args) {
        List<EmployeeRecord> records = List.of(
            new EmployeeRecord("E245", "Finance"),
            new EmployeeRecord("E110", "Engineering"),
            new EmployeeRecord("E390", "Marketing"),
            new EmployeeRecord("E101", "Engineering")
        );

        Map<String, String> lookup = buildLookup(records);

        System.out.println("--- Sample Test Cases ---");
        System.out.println("Lookup E390: " + getDepartment(lookup, "E390")); // Expected: "Marketing"
        System.out.println("Lookup E999: " + getDepartment(lookup, "E999")); // Expected: "Unknown"

        System.out.println("\n--- Custom Test Cases ---");
        System.out.println("Lookup E110: " + getDepartment(lookup, "E110")); // Expected: "Engineering"
        System.out.println("Lookup E245: " + getDepartment(lookup, "E245")); // Expected: "Finance"
    }
}
