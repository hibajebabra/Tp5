package partie3;

class Boite<T> {

    private T contenu;

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }
}

public class ex1 {

    public static void main(String[] args) {

        Boite<String> b1 = new Boite<>();

        b1.setContenu("java");

        System.out.println(b1.getContenu());

        Boite<Integer> b2 = new Boite<>();

        b2.setContenu(18);

        System.out.println(b2.getContenu());
    }
}