public class ShowTower {
    static int[] lift_pos = new int[5];
    static int[] cnt_people = new int[5];

    static void show_ceil() {
        for (int i = 0; i < 5; i++) {
            System.out.print("+---+ ");
        }
        System.out.println();
    }

    static void show_mid(int pos) {
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
            if (lift_pos[i] == pos) {
                System.out.print("|" + cnt_people[i] + "|");
            } else {
                System.out.print("   ");
            }
            System.out.print("| ");
        }

        for (int i: Lift.floor.get(pos)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static synchronized void show() {
        for (int i = 8; i >= 0; i--) {
            show_ceil();
            show_mid(i);
        }
        show_ceil();
        System.out.println();
        System.out.println();
    }
}
