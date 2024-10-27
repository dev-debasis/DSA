
class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Display the linked list
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("HEAD"); // To indicate the circular nature
        }

    }

    // Insert element in the starting position
    public void insertAtStart(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head; // Ensure circularity
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
    }

    // Insert at end
    public void insertAtEnd(int value) {
        Node node = new Node(value);
        if (head == null) {
            insertAtStart(value);
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
            }
            node = node.next;
        } while (node != head);

    }
}

public class Structure {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(12);
        list.insertAtStart(23);
        list.insertAtStart(56);
        list.display();
        list.delete(23);
        list.display();

    }
}
