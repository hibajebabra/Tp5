package partie2;

class SoldeInsuffisantException extends Exception {

    public SoldeInsuffisantException(String msg) {
        super(msg);
    }
}

class CompteBancaire {

    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant)
            throws SoldeInsuffisantException {

        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant");
        }

        solde -= montant;
    }
}

public class ex1 {

    public static void main(String[] args) {

        CompteBancaire c = new CompteBancaire(1000);

        try {

            c.retirer(2600);

        } catch (SoldeInsuffisantException e) {

            System.out.println(e.getMessage());
        }
    }
}