public class Book {
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {return author; }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    public String describe() {
        String status = isBorrowed ? "Borrowed" : "Available";
        return title + " by " + author + " [" + status + "]";
    }

    @Override
    public String toString() {
        return describe();
    }
}
