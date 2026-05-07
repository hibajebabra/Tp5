package partie1;


class texte {
	public int longueur(String chaine) {
		try {
			return chaine.length();
		}
		
		catch(NullPointerException e) {
			
			System.out.println("la chaine est null");
			return 0;
		}
	}
}
public class ex2v2 {
	public static void main(String[] args) {
		text t = new text();
		
		String mot1 = "jebabra";
		
		int resultat1 = t.longueur(mot1);
		
		System.out.println("longueur = "+resultat1);
		
		String mot2 = null;
		
		int resultat2 = t.longueur(mot2);
		
		System.out.println("longueur ="+resultat2);
		
	}

}
