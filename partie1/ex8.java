package partie1;

public class ex8 {

    public static void verifierAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("age inférieur a 18");
        }

        System.out.println("age valid");
    }

    public static void main(String[] args) {

        try {

            verifierAge(10);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}