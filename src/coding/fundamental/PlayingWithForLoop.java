package coding.fundamental;

public class PlayingWithForLoop {

    public static void reversePrint() {
        for (var i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void infitieLoop() {
        for (;;) {
            System.out.println("Hello, I am infite!");
        }
    }

    public static void multiTermLoop() {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println(x + " ");
    }

    public static void buggyLoop() {
        int x = 0;
        for (; x < 4; x++) {
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        // reversePrint();
        // infitieLoop();
        // multiTermLoop();
        buggyLoop();

    }
}
