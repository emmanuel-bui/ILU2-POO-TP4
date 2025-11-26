package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson", UnitesProduit.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public String decrireProduit() {
		return "poissons pêchés " + datePeche;
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
}
