package partie2;

class AuthentificationException extends Exception {

    public AuthentificationException(String msg) {
        super(msg);
    }
}

public class ex5 {

    public static void login(String user, String pass)
            throws AuthentificationException {

        if (!user.equals("hiba")
                || !pass.equals("1234")) {

            throw new AuthentificationException(
                    "identifiants incorrects");
        }

        System.out.println("connexion réussie");
    }

    public static void main(String[] args) {

        try {

            login("log", "2020");

        } catch (AuthentificationException e) {

            System.out.println(e.getMessage());
        }
    }
}