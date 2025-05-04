package coding.datastructures.linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CirrcularLL {

    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-> ");
            curr = curr.next;
            if (curr == head) {
                System.out.println(head.data);
                break;
            }
        }
        System.out.println();
    }

    static void printListWithLast(Node last) {
        if (last == null)
            return;

        Node head = last.next;
        while (true) {
            System.out.print(head.data + "-> ");
            head = head.next;
            if (head == last.next)
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = head;
        Node last = head.next.next.next.next;
        last.next = head;
        printList(head);
        printListWithLast(last);

    }
}
