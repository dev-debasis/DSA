class LinkedList {
    private Node head;
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

    // Insert using recursion
    public void insertRec(int value, int index) {
        if (index == 0) {
            Node node = new Node(value, head);
            // node.next = head;
            head = node;
            size++;
            return;
        }
        helper(value, index, head);
    }

    // helper function for the insert using rec
    public void helper(int value, int index, Node currentNode) {
        if (index == 1) {
            Node node = new Node(value, currentNode.next);
            // node.next = currentNode.next;
            currentNode.next = node;
            size++;
            return;
        }
        helper(value, index - 1, currentNode.next);
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
}

public class InsertioRecursion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionStart(1);
        list.insertionStart(2);
        list.insertionStart(3);
        list.display();
        list.insertRec(77, 0);
        list.insertRec(78, 1);
        list.insertRec(79, 2);
        list.display();
        System.out.println("Size of the list: "+ list.size);
    }
}