package partie2;

class MontantInvalideException extends Exception {
    public MontantInvalideException(String msg) {
        super(msg);
    }
}

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String msg) {
        super(msg);
    }
}

class Compte {

    double solde = 1000;

    public void retirer(double montant)
            throws MontantInvalideException,
                   SoldeInsuffisantException {

        if (montant <= 0) {
            throw new MontantInvalideException("montant invalide");
        }

        if (montant > solde) {
            throw new SoldeInsuffisantException("solde insuffisant");
        }

        solde -= montant;
    }
}

public class ex3{

    public static void main(String[] args) {

        Compte c = new Compte();

        try {

            c.retirer(-9);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}