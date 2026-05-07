package partie3;

public class ex6 {

    public static <T> void afficherTableau(T[] tableau) {

        for (T x : tableau) {
            System.out.println(x);
        }
    }

    public static <T> T getPremier(T[] tableau) {

        return tableau[0];
    }

    public static void main(String[] args) {

        Integer[] tab = {4,2,9};

        afficherTableau(tab);

        System.out.println(getPremier(tab));
    }
}