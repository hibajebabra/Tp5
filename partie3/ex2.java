package partie3;

class Paire<T,U> {

    T premier;
    U second;

    public Paire(T premier, U second) {
        this.premier = premier;
        this.second = second;
    }

    public void afficherPaire() {

        System.out.println(
                premier + " - " + second);
    }
}

public class ex2{

    public static void main(String[] args) {

        Paire<String,Integer> p =
                new Paire<>("hiba", 15);

        p.afficherPaire();
    }
}