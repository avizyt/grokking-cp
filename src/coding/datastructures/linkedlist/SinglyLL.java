package coding.datastructures.linkedlist;

public class SinglyLL {
    public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        traverseList(head);
    }
}
