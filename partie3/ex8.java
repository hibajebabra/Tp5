package partie3;

class Animal<T> {

    T nom;
}

class Chien extends Animal<String> {

}

public class ex8 {

    public static void main(String[] args) {

        Chien c = new Chien();

        c.nom = "alex";

        System.out.println(c.nom);
    }
}