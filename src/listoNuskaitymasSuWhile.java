import java.util.ArrayList;
import java.util.Scanner;

public class listoNuskaitymasSuWhile {
    public static void main(String[] args) {
        ArrayList<Integer> temperaturos = nuskaitytiLista();
        System.out.println("temperaturos = " + temperaturos);
    }



    public static ArrayList<Integer> nuskaitytiLista(){
        Scanner skaitytuvas = new Scanner(System.in);
        final String stabdymozodis = "STOP";                        // final - konstanta, kurios negalima keisti;
        ArrayList<Integer> skaiciai = new ArrayList<>();
        System.out.println("Įveskite sąrašo skaičius, nei norite sustoti, rašykite STOP");
        String eilute;
        eilute = skaitytuvas.nextLine();
        while (!eilute.equalsIgnoreCase(stabdymozodis)){            // ! prieš salygą -reiškia priešingybė;
            int skaicius = Integer.parseInt(eilute);
            skaiciai.add(skaicius);
            eilute = skaitytuvas.nextLine();
        }
        return skaiciai;
    }
}
