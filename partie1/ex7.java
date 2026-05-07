package partie1;

public class ex7 {

    public static void C() {

        throw new ArithmeticException("erreur en C");
    }

    public static void B() {

        C();
    }

    public static void A() {

        try {

            B();

        } catch (ArithmeticException e) {

            System.out.println("exception en A");
        }
    }

    public static void main(String[] args) {

        A();
    }
}
