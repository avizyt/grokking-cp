package coding.fundamental;

class FindInMatrix {

    public static void main(String[] args) {
        int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
        int searchValue = 2;
        int pX = -1;
        int pY = -1;

        PARENT_LOOP: for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    pX = i;
                    pY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (pX == -1 || pY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at:" + "(" + pX + "," + pY + ")");
        }
    }
}