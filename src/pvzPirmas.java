import java.util.ArrayList;
import java.util.Arrays;

public class pvzPirmas {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = new ArrayList<>();

        skaiciai.add(5);
        skaiciai.add(9);
        skaiciai.add(-63);

        System.out.println("skaiciai = " + skaiciai);

        // Išimu listo ilgį;
        skaiciai.size();
        System.out.println("skaiciai.size() = " + skaiciai.size());

        // Įšimu iš listo skaičių 9;
        skaiciai.remove(Integer.valueOf(9));
        System.out.println("skaiciai = " + skaiciai);

        // Išimu iš listo paskutinį skaičių;
        skaiciai.remove(skaiciai.size()-1);
        System.out.println("skaiciai = " + skaiciai);

        // Įdedu kelis skaičius;
        skaiciai.add(25);
        skaiciai.add(39);
        skaiciai.add(-15);
        skaiciai.add(41);
        System.out.println("skaiciai = " + skaiciai);

        // Išvedu tik antrą skaičių;
        System.out.println("skaiciai.get(2) = " + skaiciai.get(2));

        // Pakeičiu trečio elemento reikšmę į 100;
        skaiciai.set(3, 100);
        System.out.println("skaiciai = " + skaiciai);

        // Pasakau, kad skaiciai yra naujas arraylist
        skaiciai = new ArrayList<>();
        System.out.println("skaiciai = " + skaiciai);
    }
}
