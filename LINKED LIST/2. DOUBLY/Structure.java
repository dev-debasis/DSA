class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
        head = null;
        tail = null;
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END"); // To indicate the end of the list
    }

    // Display in reverse order
    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Fetching any previous/next node we want to process with
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Insert element in the starting position
    public void insertAtStart(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    // Insert at end
    public void insertAtEnd(int value) {
        Node node = new Node(value);
        if (head == null) {
            insertAtStart(value);
            return;
        }

        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
        size++;
    }

    // Insert at a given index
    public void insertAtIndex(int value, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            insertAtStart(value);
            return;
        }
        if (index == size) {
            insertAtEnd(value);
            return;
        }

        Node node = new Node(value);
        Node temp;
        if(index < size / 2){
            temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
        }else{
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        //Node temp = get(index - 1);
        temp.next.prev = node;
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        size++;
    }
}

public class Structure {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(2);
        list.insertAtStart(12);
        list.insertAtStart(26);
        list.insertAtEnd(20);
        list.display();
        list.insertAtIndex(23, 2);
        list.display();
        list.displayReverse();
    }
}
