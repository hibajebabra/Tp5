package partie2;

class EmailInvalideException extends Exception {
    public EmailInvalideException(String msg) {
        super(msg);
    }
}

class AgeInvalideException extends Exception {
    public AgeInvalideException(String msg) {
        super(msg);
    }
}

public class ex4 {

    public static void inscrire(String email, int age)
            throws EmailInvalideException,
                   AgeInvalideException {

        if (!email.contains("@")) {
            throw new EmailInvalideException("email invalide");
        }

        if (age < 18) {
            throw new AgeInvalideException("age invalide");
        }

        System.out.println("Inscription reussie");
    }

    public static void main(String[] args) {

        try {

            inscrire("hiba", 20);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}