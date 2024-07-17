package DSA_Book;

public class AAAC_DoublyLinkedList {

    public static void main(String[] args) {
        DNode head = insertAtBeginning(null, 5);
        head = insertAtLast(head, 10);
        head = insertAtBeginning(head, 0);
        head = insertAtLast(head, 15);
        System.out.println("Total Elements : " + countElements(head));
        printList(head);
    }

    public static int countElements(DNode head) {
        DNode temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public static void printList(DNode head) {
        DNode temp = head;
        while (null != temp) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();//no usage, just for ease printing on console
    }

    //insertAtBeginning
    public static DNode insertAtBeginning(DNode head, int data) {
        DNode newDNode = new DNode(data);
        newDNode.next = head;
        return newDNode;
    }

    public static DNode insertAtLast(DNode head, int data) {
        DNode newNode = new DNode(data);
        if (null == head) {
            return newNode;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }

}

class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
    }
}
