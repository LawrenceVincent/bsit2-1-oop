import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    // 1. DATA TYPES & VARIABLES
    private int id;
    private String name;
    private int age;
    private String course;
    private double grade;
    private boolean isEnrolled;

    public Student(int id, String name, int age, String course, double grade, boolean isEnrolled) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
        this.isEnrolled = isEnrolled;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getGrade() { return grade; }

    public String getStanding() {
        // 3. IF/ELSE CONDITIONAL LOGIC
        if (this.grade >= 90.0) {
            return "Dean's Lister";
        } else if (this.grade >= 75.0) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}

public class Main {
    private static final List<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Seed initial records to mirror the image example
        students.add(new Student(101, "Dennis Acantilado", 18, "BSIT-CISCO", 85.0, true));
        students.add(new Student(102, "Kenneth Troy C. Bada", 19, "BSCS-1", 89.5, true));
        students.add(new Student(103, "Postheart H. Reddings", 20, "BSIT-1", 78.25, true));

        // 5. LOOP TYPE 1: WHILE LOOP (Runs menu infinitely until choice 5 is selected)
        int choice = 0;
        while (choice != 5) {
            System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
            System.out.println("[1] Add Student");
            System.out.println("[2] View All Students");
            System.out.println("[3] Search Student by ID");
            System.out.println("[4] View Statistics");
            System.out.println("[5] Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume trailing newline

            // 4. SWITCH STRUCTURE
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    viewStatistics();
                    break;
                case 5:
                    System.out.println("Thank you for using the Student Information System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                    break;
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();
        System.out.print("Is Enrolled (true/false): ");
        boolean isEnrolled = scanner.nextBoolean();

        students.add(new Student(id, name, age, course, grade, isEnrolled));
        System.out.println(">> Student added successfully!");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- STUDENT RECORDS ---");
        System.out.printf("%-5s %-15s %-5s %-8s %-7s %-15s\n", "ID", "NAME", "AGE", "COURSE", "GRADE", "STANDING");

        // 5. LOOP TYPE 2: FOR-EACH LOOP (Iterating over array components)
        for (Student s : students) {
            System.out.printf("%-5d %-15s %-5d %-8s %-7.1f %-15s\n",
                    s.getId(), s.getName(), s.getAge(), s.getCourse(), s.getGrade(), s.getStanding());
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (Student s : students) {
            if (s.getId() == searchId) {
                System.out.println("\nRecord Found:");
                System.out.printf("ID: %d | Name: %s | Course: %s | Grade: %.1f\n",
                        s.getId(), s.getName(), s.getCourse(), s.getGrade());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student ID not found.");
        }
    }

    private static void viewStatistics() {
        if (students.isEmpty()) {
            System.out.println("No data available for statistics.");
            return;
        }

        int total = students.size();
        double sum = 0.0;
        Student topStudent = students.get(0);

        for (Student s : students) {
            // 2. OPERATORS (Arithmetic addition assignment operators & Comparison operator)
            sum += s.getGrade();
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }

        // 2. OPERATORS (Arithmetic division operator)
        double average = sum / total;

        System.out.println("\n--- STATISTICS ---");
        System.out.printf("Total Students : %d\n", total);
        System.out.printf("Average Grade  : %.2f\n", average);
        System.out.printf("Top Student    : %s (%.1f)\n", topStudent.getName(), topStudent.getGrade());
    }
}
