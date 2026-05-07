package partie1;

public class ex4 {

    public static int convertir(String ch) {

        try {
            return Integer.parseInt(ch);

        } catch (NumberFormatException e) {
            System.out.println("conversion impossible");
            return 0;
        }
    }

    public static void main(String[] args) {

        int x = convertir("51");

        System.out.println(x);

        convertir("nom");
    }
}