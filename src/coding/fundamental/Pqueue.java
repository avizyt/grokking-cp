package coding.fundamental;

import java.util.PriorityQueue;

public class Pqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 1; i < 10; i++) {
            p.add(i * 2);
        }

        for (Integer item : p) {
            System.out.println(item);
        }
    }
}
