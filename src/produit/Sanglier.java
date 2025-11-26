package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private double poids;
	private Gaulois chasseur;

	public Sanglier(double poids, Gaulois chasseur) {
		super("sanglier", UnitesProduit.KG);
		this.chasseur = chasseur;
		this.poids = poids;
	}

	@Override
	public String decrireProduit() {
		return "sanglier de " + poids + " chassé par " + chasseur.getNom();
	}
}
