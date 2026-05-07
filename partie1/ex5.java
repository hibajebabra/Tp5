package partie1;

public class ex5 {

    public static int racineCarree(int x) {

        if (x < 0) {
            throw new IllegalArgumentException("nombre negatif");
        }

        return (int)Math.sqrt(x);
    }

    public static void main(String[] args) {

        try {
            System.out.println(racineCarree(49));

            System.out.println(racineCarree(-9));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}