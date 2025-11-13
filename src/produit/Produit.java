package produit;

public abstract class Produit {
	private String nom;
	private UnitesProduit unite;

	protected Produit(String nom, UnitesProduit unite) {
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}

	public abstract String decrireProduit();
}
