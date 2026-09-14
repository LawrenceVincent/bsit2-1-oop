import java.util.Scanner;


class Java {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            head = null;
        }
        int getSize() {
            int count = 0;
            Node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
        void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }



        void insertAtPosition(int data, int position) {
            int currentSize = getSize();


            if (position < 1 || position > currentSize + 1) {
                System.out.println("Invalid position! Please enter a position between 1 and " + (currentSize + 1) + ".");
            }


            Node newNode = new Node(data);


            if (position == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node current = head;
            int count = 1;

            while (count < position - 1) {
                current = current.next;
                count++;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        void display() {

            if (head == null) {
                System.out.println("No students registered on the clinic's queue.");
                return;
            }

            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }


            System.out.println("null");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        LinkedList list = new LinkedList();

        System.out.println();

        System.out.print("Enter student to insert: ");
        int value = input.nextInt();

        System.out.print("Enter position: ");
        int position = input.nextInt();

        list.insertAtPosition(value, position);

        System.out.println();

        System.out.print("Updated student queue: ");
        list.display();

        input.close();
    }
}