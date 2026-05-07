package partie1;
import java.util.Scanner;

public class ex3 {

    
    public static void accesIf(int[] tab, int index) {

        if (index >= 0 && index < tab.length) {
            System.out.println(tab[index]);
        } else {
            System.out.println("erreur");
        }
    }

    
    public static void accesTry(int[] tab, int index) {

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index hors limites");
        }
    }

    public static void main(String[] args) {

        int[] tab = {4,2,3,4,5};

        accesIf(tab, 5);

        accesTry(tab, 25);
    }
}