package partie3;

interface Calcul<T> {

    T addition(T a, T b);
}

class CalculInteger implements Calcul<Integer> {

    public Integer addition(Integer a, Integer b) {

        return a + b;
    }
}

class CalculDouble implements Calcul<Double> {

    public Double addition(Double a, Double b) {

        return a + b;
    }
}

public class ex3{

    public static void main(String[] args) {

        CalculInteger c1 = new CalculInteger();

        System.out.println(c1.addition(8,3));

        CalculDouble c2 = new CalculDouble();

        System.out.println(c2.addition(4.5,1.7));
    }
}