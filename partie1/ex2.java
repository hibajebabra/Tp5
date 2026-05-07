package partie1;

class text{
	
	public int longueur(String chaine) {
		
		if(chaine == null) {
			System.out.println("la chaine est null");
			return 0;
		}
		return chaine.length();
	}
}
public class ex2 {
	public static void main(String [] args ) {
		
		text t = new text ();
		
		String mot1 = "hiba";
		
		int resultat1 = t.longueur(mot1);
		System.out.println("Longueur = " + resultat1);
		
		String mot2 = null;

        int resultat2 = t.longueur(mot2);

        System.out.println("Longueur = " + resultat2);
    }
}
		
