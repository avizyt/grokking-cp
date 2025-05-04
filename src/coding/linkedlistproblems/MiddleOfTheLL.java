package coding.linkedlistproblems;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MiddleOfTheLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node mid = findMiddle(head);
        System.out.println(mid.data);
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
