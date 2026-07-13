import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n=" +
                    "=~=~= LIBRARY INFORMATION SYSTEM =~=~=");
            System.out.println("1. Add a book");
            System.out.println("2. List all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Search a book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // Clear scanner buffer
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); // Clear invalid token
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter title : ");
                    String title = input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Enter title to borrow: ");
                    String borrowTitle = input.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("Enter title to return: ");
                    String returnTitle = input.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.print("Enter title to search: ");
                    String searchTitle = input.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 0:
                    System.out.println(">> Thank you for using the Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 0 and 5.");
            }
        }
        input.close();
    }
}
