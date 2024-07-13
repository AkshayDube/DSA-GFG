package DSA_Book;

public class AAAB_SinglyLinkedList {
    public static void main(String[] args) {
        Node head = insertAtBeginning(null, 5);
        head = insertAtBeginning(head, 10);
        head = insertAtBeginning(head, 15);
        head = insertAtBeginning(head, 20);
        System.out.println("Total Elements : " + countElements(head));
        printList(head);
        head = insertAtLast(head, 100);
        head = insertAtLast(head, 110);
        head = insertAtLast(head, 120);
        System.out.println("\nTotal Elements : " + countElements(head));
        printList(head);
    }

    //to print all elements in list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    //count the elements in the list
    public static int countElements(Node head) {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (null == head)
            return newNode;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }


}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}