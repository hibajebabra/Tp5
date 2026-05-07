package partie2;

class PaiementRefuseException extends Exception {

    public PaiementRefuseException(String msg) {
        super(msg);
    }
}

class CarteExpireeException extends Exception {

    public CarteExpireeException(String msg) {
        super(msg);
    }
}

public class ex9 {

    public static void payer(
            double montant,
            boolean expiree)
            throws PaiementRefuseException,
                   CarteExpireeException {

        if (montant > 5000) {
            throw new PaiementRefuseException(
                    "montant dépasse les limite");
        }

        if (expiree) {
            throw new CarteExpireeException(
                    "carte expiree");
        }

        System.out.println("paiement valid");
    }

    public static void main(String[] args) {

        try {

            payer(7000, true);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}