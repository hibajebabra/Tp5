package partie1;

import java.util.Scanner;

class Calcule {

   
    public int division(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division par zéro interdite ");
        }

        return a / b;
    }
}

public class ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("entrez le premier nombre : ");
            int x = sc.nextInt();

            System.out.print("entrez le deuxième nombre : ");
            int y = sc.nextInt();

            
            Calcule c = new Calcule();

            
            int resultat = c.division(x, y);

            System.out.println("resultat = " + resultat);

        }

        catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        catch(Exception e) {
        	System.out.println("nombre invalid");
        }
    }
}
	


