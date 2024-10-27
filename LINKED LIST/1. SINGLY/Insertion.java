
public class Insertion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionStart(1); // Insert the number 1 at the start of the list
        list.insertionStart(2); // Insert the number 2 at the start of the list
        list.insertionStart(3); // Insert the number 3 at the start of the list
        list.insertionEnd(5);
        list.insertAnyPosition(34, 2);
        list.display();  
        list.insertRec(77, 4);
        list.display();
    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int size;

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
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    // Now let's insert a node at the end
    public void insertionEnd(int value) {
        Node node = new Node(value);
        if (tail == null) { // there is no element present
            insertionEnd(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at any position
    public void insertAnyPosition(int value, int index) {
        if (index == 0) {
            insertionStart(value);
            return;
        }
        if (index == size) {
            insertionEnd(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }


    // Insert using recursion
    public void insertRec(int value, int index){
        if(index == 0){
            Node node = new Node(value);
            node.next = head;
            head = node;
            size++;
            return;
        }
        helper(value, index, head);
    }
    // helper function for the insert using rec
    public void helper(int value, int index, Node currentNode) {
        if (index == 1) {
            Node node = new Node(value);
            node.next = currentNode.next;
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
