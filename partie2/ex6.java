package partie2;

class StockInsuffisantException extends Exception {

    public StockInsuffisantException(String msg) {
        super(msg);
    }
}

class Produit {

    int stock = 3;

    public void retirerDuStock(int qte)
            throws StockInsuffisantException {

        if (qte > stock) {
            throw new StockInsuffisantException(
                    "stock insuffisant");
        }

        stock -= qte;
    }
}

public class ex6 {

    public static void main(String[] args) {

        Produit p = new Produit();

        try {

            p.retirerDuStock(12);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}