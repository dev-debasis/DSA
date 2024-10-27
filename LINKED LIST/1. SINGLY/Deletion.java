
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

        // public Node(int value, Node next) {
        //     this.value = value;
        //     this.next = next;
        // }
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

    // Fetching any previous/next node we want to process with
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            node = node.next;
            if(node.value == value){
                return node;
            }
        }
        return null;
    }

    // Delete the first node
    public void deleteStartNode() {
        head = head.next;   
        if (head == null) { // In case there is only one node in the list
            tail = null;
        }
        size--;
    }

    // Delete the last node
    public void deleteEndNode() {
        if (size <= 1) {
            deleteStartNode();
            return;
        }
        Node temp = get(size - 2);
        tail = temp;
        tail.next = null;
        size--;
    }

    // Delete element from any index
    public void deleteAnyIndex(int index) {
        if (index == 0) {
            deleteStartNode();
            return;
        }
        if (index == size - 1) {
            deleteEndNode();
            return;
        }
        Node prevNode = get(index - 1);
        prevNode.next = null;
        prevNode.next = prevNode.next.next;
        size--;
    }
}

public class Deletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionStart(4);
        list.insertionStart(3);
        list.insertionStart(6);
        list.insertionStart(63);
        list.insertionStart(16);
        // list.display();
        // list.deleteStartNode();
        // list.display();
        // list.deleteEndNode();
        // list.display();
        // list.deleteAnyIndex(4);
        // list.display();
        //
        System.out.println(list.find(63));

    }
}
