package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", UnitesProduit.KG);
		this.chasseur = chasseur;
		this.poids = poids;
	}

	@Override
	public String decrireProduit() {
		return "sanglier de " + poids + " chassé par " + chasseur.getNom();
	}

	@Override
	public int calculerPrix(int prix) {
		return (poids * prix) / 1000;
	}
}
