package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private UnitesProduit unite;

	protected Produit(String nom, UnitesProduit unite) {
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public String getNom() {
		return nom;
	}

	public int calculerPrix(int prix) {
		if (unite == UnitesProduit.G) {
			prix /= 0.01; // ??? si on vend de base en grammes ça fait /2 ? aucun sens?
		}
		return prix;
	}
}
