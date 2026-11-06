import java.util.ArrayList;
import java.util.List;

/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C
 * Part A — Coding Problems
 * 
 * Problem 1: Library Catalog Lookup
 * 
 * TASK:
 * A small community library keeps its catalog as a simple list of book records. Each record contains an ISBN
 * (a unique numeric string) and a title. The catalog is provided already sorted by ISBN in ascending order
 * and is queried far more often than it is updated. Implement a function findBook(catalog, targetIsbn) that
 * returns the title if found, or 'Not Found' if the ISBN does not exist. Your approach must take advantage of
 * the fact that the catalog is sorted. State the time and space complexity of your solution, and explain why
 * it is appropriate given that queries vastly outnumber updates.
 * 
 * COMPLEXITY & JUSTIFICATION:
 * - Time Complexity: O(log n) using Binary Search over the sorted catalog.
 * - Space Complexity: O(1) auxiliary space beyond the input data.
 * - Justification: Since queries vastly outnumber updates, maintaining the catalog in sorted order
 *   allows each lookup to run in O(log n) time rather than O(n) linear scanning. The one-time sorting
 *   cost on rare updates is heavily amortized by the high frequency of fast queries.
 */
public class Problem1_LibraryCatalogLookup {

    public static class Book {
        public String isbn;
        public String title;

        public Book(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        @Override
        public String toString() {
            return "(" + isbn + ", \"" + title + "\")";
        }
    }

    /**
     * Binary search to find a book title by ISBN in a sorted catalog.
     *
     * @param catalog list of books sorted ascending by ISBN
     * @param targetIsbn the ISBN string to search for
     * @return the book title if found, or "Not Found"
     */
    public static String findBook(List<Book> catalog, String targetIsbn) {
        if (catalog == null || targetIsbn == null || catalog.isEmpty()) {
            return "Not Found";
        }

        int left = 0;
        int right = catalog.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = catalog.get(mid);
            int cmp = midBook.isbn.compareTo(targetIsbn);

            if (cmp == 0) {
                return midBook.title;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        List<Book> catalog = new ArrayList<>();
        catalog.add(new Book("0001112223", "Introduction to Algebra"));
        catalog.add(new Book("0002223334", "Beginning Python"));
        catalog.add(new Book("0003334445", "Classic Mythology"));
        catalog.add(new Book("0004445556", "Data and Society"));
        catalog.add(new Book("0005556667", "European History"));

        System.out.println("--- Sample Test Cases ---");
        String target1 = "0003334445";
        System.out.println("Search \"" + target1 + "\": " + findBook(catalog, target1));

        String target2 = "0009998887";
        System.out.println("Search \"" + target2 + "\": " + findBook(catalog, target2));

        System.out.println("\n--- Custom Test Cases ---");
        String targetCustom1 = "0001112223";
        System.out.println("Search \"" + targetCustom1 + "\" (First element): " + findBook(catalog, targetCustom1));

        String targetCustom2 = "0005556667";
        System.out.println("Search \"" + targetCustom2 + "\" (Last element): " + findBook(catalog, targetCustom2));
    }
}
