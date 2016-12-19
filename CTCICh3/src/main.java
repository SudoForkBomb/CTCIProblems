import java.util.HashMap;

/**
 * Created by crtaylor123 on 12/11/16.
 */
public class main {


    public static void main(String[] args) {
        StackOfPlates plates = new StackOfPlates();
        System.out.println("Stack:" + plates.getCurrentStackPointer());
        System.out.println("Plates: " + plates.getPlateCounter());
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        plates.push(1);

        System.out.println("Stack:" + plates.getCurrentStackPointer());
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        System.out.println("Stack:" + plates.getCurrentStackPointer());
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        plates.push(1);
        plates.push(1);
        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        System.out.println("Stack:" + plates.getCurrentStackPointer());

        plates.push(1);
        System.out.println("Plates: " + plates.getPlateCounter());
        System.out.println("Stack:" + plates.getCurrentStackPointer());

    }
}
