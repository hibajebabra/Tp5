package partie1;

class machine6{

    private boolean etat = false;

    public void demarrer() {

        if (etat) {
            throw new IllegalStateException("machine  ON");
        }

        etat = true;

        System.out.println("machine demarrée");
    }
}

public class ex6 {

    public static void main(String[] args) {

        machine6 m = new machine6();

        try {

            m.demarrer();

            m.demarrer();

        } catch (IllegalStateException e) {

            System.out.println(e.getMessage());
        }
    }
}