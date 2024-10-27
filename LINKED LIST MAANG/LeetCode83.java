class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
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

    public void removeDuplicateElement() {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == currentNode.next.value) {
                currentNode.next = currentNode.next.next;
                size--;
            } else {
                currentNode = currentNode.next;
            }
        }
        tail = currentNode;
        tail.next = null;
    }
}
 
public class LeetCode83 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionStart(4);
        list.insertionStart(4);
        list.insertionStart(3);
        list.insertionStart(2);
        list.insertionStart(1);
        list.insertionStart(1);
        list.display();
        list.removeDuplicateElement();
        list.display();
    }
}
