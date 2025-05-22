public class Book {
    String bookName;
    String author;
    boolean isAvailable;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + bookName);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: " + bookName);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public void displayInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
