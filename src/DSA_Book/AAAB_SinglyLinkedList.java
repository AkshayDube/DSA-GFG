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
        System.out.println("Total Elements : " + countElements(head));
        printList(head);
        head = insertAtPosition(head, 15,-1);
        head = insertAtPosition(head,15,10);
        head = insertAtPosition(head, 0,5);
        System.out.println("Total Elements : " + countElements(head));
        printList(head);
    }

    //to print all elements in list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();//just for proper spacing on console// other than that no use of it
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

    public static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        if (position < 1) {
            System.out.println("Negative Position not allowed");
            return head;
        } else if (position == 1) {
            newNode.next = head;
            return newNode;
        } else {
            int counter = 1;
            Node temp = head;
            while (counter < position - 1 && null != temp) {
                temp = temp.next;
                counter++;
            }
            if (temp == null) {
                System.out.println("Position out of range");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
            return head;
        }
    }

}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}