package coding.datastructures.linkedlist;

import java.util.Stack;

public class SinglyLL {
    public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");

            head = head.next;
        }
        System.out.println();
    }

    public static boolean searchList(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                return true;
            } else {
                head = head.next;
            }
        }
        return false;
    }

    public static int lengthOfList(Node head) {
        int length = 0;
        while (head != null) {
            length += 1;
            head = head.next;
        }
        return length;

    }

    public static Node insertAtFront(Node head, int data) {
        Node curr = new Node(data);
        curr.next = head;

        return curr;

    }

    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;

        return head;
    }

    public static Node insertAtPosition(Node head, int data, int pos) {

        if (pos < 1) {
            return head;
        }
        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;

        }

        Node curr = head;

        // traversing the node to find before node of the new node
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // the position is greater than number of element
        if (curr == null) {
            return head;
        }

        // update next pointer
        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;

        return head;

    }

    public static Node removeAtEnd(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        // travering the list find second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        return head;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        /*
         * [10| ]-> [20| ]-> [30| ]->null
         * prev curr next
         */
        while (curr != null) {

            // link setting
            next = curr.next;
            curr.next = prev;

            // node transfer
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static Node reverseListStack(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }
        if (!st.isEmpty()) {
            head = st.pop();
            temp = head;

            while (!st.isEmpty()) {
                temp.next = st.pop();
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("-> " + curr.data);
            curr = curr.next;
        }
        System.out.print("-> " + "null");
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        // head = insertAtFront(head, 20);
        // System.out.println(lengthOfList(head));
        // printList(head);
        // head = insertAtEnd(head, 30);
        // printList(head);
        // head = insertAtPosition(head, 40, 2);
        // printList(head);
        // head = removeAtEnd(head);
        printList(head);
        System.out.println("Reversed List");
        // head = reverseList(head);
        head = reverseListStack(head);
        printList(head);

    }
}
