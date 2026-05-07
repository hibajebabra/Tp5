package partie3;

import java.util.List;
import java.util.Arrays;

public class ex12 {

    public static void afficherNombres(
            List<? extends Number> liste) {

        for (Number x : liste) {

            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        List<Integer> l1 =
                Arrays.asList(1,2,3);

        List<Double> l2 =
                Arrays.asList(1.1,2.2);

        afficherNombres(l1);

        afficherNombres(l2);
    }
}
