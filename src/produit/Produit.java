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
}
