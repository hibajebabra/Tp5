package partie2;

class QuotaDepasseException extends Exception {

    public QuotaDepasseException(String msg) {
        super(msg);
    }
}

public class ex7 {

    public static void telechargerFichier(double taille)
            throws QuotaDepasseException {

        double limite = 200;

        if (taille > limite) {
            throw new QuotaDepasseException(
                    "quota depaseee");
        }

        System.out.println("telechargement OK");
    }

    public static void main(String[] args) {

        try {

            telechargerFichier(380);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}