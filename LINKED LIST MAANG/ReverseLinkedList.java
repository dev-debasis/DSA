class LinkedList {
    Node head;
    private Node tail;
     int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
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

    // Insert a node at the start of the list
    public void insertionStart(int value) {
        Node node = new Node(value, head);
        // node.next = head;
        head = node;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); // To indicate the end of the list
    }


    // Reversing LinedList using Recursion
    public void reversionRecursion(Node node) {
        if(node == tail){
            head = tail;
            return;
        }
        reversionRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionStart(1);
        list.insertionStart(2);
        list.insertionStart(3);
        list.insertionStart(4);
        list.insertionStart(5);
        list.display();
        list.reversionRecursion(list.head);
        list.display();

    }
}