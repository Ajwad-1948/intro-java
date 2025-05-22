public class Main {
    public static void main(String[] args) {
        // Create a book
        Book book1 = new Book("Java for Beginners", "John Smith");

        // Display book info
        book1.displayInfo();

        // Borrow the book
        book1.borrowBook();
        book1.displayInfo();

        // Try borrowing again
        book1.borrowBook();

        // Return the book
        book1.returnBook();
        book1.displayInfo();
    }
}
