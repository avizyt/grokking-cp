package coding.datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListAPI {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            ll.add(10 * i);
        }
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

    }
}
