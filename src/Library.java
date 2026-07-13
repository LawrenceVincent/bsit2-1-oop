import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(">> Book added successfully.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library catalog.");
            return;
        }
        System.out.println("--- Library Catalog ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).describe());
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrow();
                    System.out.println(">> You borrowed '" + book.getTitle() + "'.");
                } else {
                    System.out.println(">> Sorry, '" + book.getTitle() + "' is already borrowed.");
                }
                return;
            }
        }
        System.out.println(">> Book '" + title + "' not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println(">> You returned '" + book.getTitle() + "'.");
                } else {
                    System.out.println(">> '" + book.getTitle() + "' was not borrowed.");
                }
                return;
            }
        }
        System.out.println(">> Book '" + title + "' not found in the library.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(">> Match found: " + book.describe());
                return;
            }
        }
        System.out.println(">> Book '" + title + "' does not exist in the library.");
    }
}
