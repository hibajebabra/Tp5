package partie3;

class Vehicule<T> {

    T vitesse;
}

class Voiture<T>
        extends Vehicule<T> {

}

public class ex9 {

    public static void main(String[] args) {

        Voiture<Integer> v =
                new Voiture<>();

        v.vitesse = 80;

        System.out.println(v.vitesse);
    }
}