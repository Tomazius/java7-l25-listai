import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListoNuskaitymasIrSuma {
    public static void main(String[] args) {
        ArrayList<Double> prekiuKainos = nuskaitytiSarasa();
        System.out.println("prekiuKainos = " + prekiuKainos);
        System.out.println("listosuma(prekiuKainos) = " + listoSuma(prekiuKainos));
    }
    public static ArrayList<Double> nuskaitytiSarasa(){
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Double> skaiciai = new ArrayList();
        System.out.println("Įveskite kiek saraše bus skaičių");
        int n = skaitytuvas.nextInt();


        for (int i = 0; i < n; i++) {
            skaiciai.add(skaitytuvas.nextDouble());
        }
        return skaiciai;
    }
    public static double listoSuma(ArrayList<Double> listas){
        double suma = 0;
        for(int i = 0; i < listas.size(); i++){
            suma = listas.get(i);
        }
        return suma;
    }
}
