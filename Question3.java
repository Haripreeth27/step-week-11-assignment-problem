/**
 * STEP SEM-3 · CodInClub | Powered by BridgeLabz
 * CATEGORY C · SORTING ALGORITHMS
 * 
 * Problem 3: The Library Book Shelf
 * 
 * TASK:
 * A library helper puts books on a shelf one at a time. The books already on the shelf are always kept in
 * increasing order of book number, and each new book slides into its correct place. Write a method
 * shelf(int[] books) that sorts the array this way and prints the shelf after each book (from the second book
 * onwards) has been placed.
 */
public class Question3 {

    /**
     * Sorts the books array in increasing order using Insertion Sort.
     * Prints the shelf after each book (from the second book onwards) is placed in position.
     *
     * @param books array of book numbers
     */
    public static void shelf(int[] books) {
        if (books == null || books.length <= 1) {
            return;
        }

        for (int i = 1; i < books.length; i++) {
            int currentBook = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > currentBook) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = currentBook;

            System.out.println("After placing " + currentBook + ": " + arrayToString(books));
        }
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
        int[] books = {30, 10, 40, 20};
        System.out.println("Initial books: " + arrayToString(books));
        shelf(books);

        System.out.println("\n--- Custom Test Input ---");
        int[] booksCustom = {52, 23, 85, 12, 44};
        System.out.println("Initial books: " + arrayToString(booksCustom));
        shelf(booksCustom);
    }
}

