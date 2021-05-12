import java.util.ArrayList;
import java.util.List;


public class MainProgram {
    public static void main(String[] args) {
        System.out.println("hello");
        Lift.make_init();

        ArrayList<Lift> lifts = new ArrayList<>();
        ShowTower.show();
        for (int i = 0; i < 5; i++) {
            lifts.add(new Lift(i));
            lifts.get(i).start();
        }
    }
}

