package partie2;

class ChampObligatoireException extends Exception {

    public ChampObligatoireException(String msg) {
        super(msg);
    }
}

public class ex8 {

    public static void validerFormulaire(
            String nom,
            String email)
            throws ChampObligatoireException {

        if (nom.isEmpty() || email.isEmpty()) {

            throw new ChampObligatoireException(
                    "remplir la case il est vide");
        }

        System.out.println("formulaire rempli");
    }

    public static void main(String[] args) {

        try {

            validerFormulaire("", "a@gmail.com");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}