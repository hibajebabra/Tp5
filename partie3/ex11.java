package partie3;

import java.util.List;
import java.util.Arrays;

public class ex11 {

    public static void afficherListe(
            List<?> liste) {

        for (Object x : liste) {

            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        afficherListe(
                Arrays.asList(5,7,8));

        afficherListe(
                Arrays.asList("ah","no"));
    }
}