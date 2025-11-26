package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import villagegaulois.IVillage;

public class Scenario {

	public static void main(String[] args) {

		// TODO Partie 4 : creer de la classe anonyme Village
		IVillage village = new IVillage() {
			private IEtal[] etals = new IEtal[3];
			private int nbEtals = 0;

			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
				etals[nbEtals] = etal;
				etal.installerVendeur(vendeur, produit, prix);
				nbEtals++;
				return true;
			}

			@Override
			public void acheterProduit(String produit, int quantiteSouhaitee) {
				int quantiteAcheteeTotal = 0;
				for (int i = 0; i < nbEtals && quantiteAcheteeTotal < quantiteSouhaitee; i++) {
					int quantiteAchetee = etals[i].contientProduit(produit, quantiteSouhaitee - quantiteAcheteeTotal);
					int prix = etals[i].acheterProduit(quantiteSouhaitee - quantiteAcheteeTotal);
					quantiteAcheteeTotal += quantiteAchetee;
					System.out.println("A l'étal n°" + (i + 1) + " j'achète " + quantiteAchetee + " et je paye " + prix
							+ " sous.");
				}
				System.out.println("Je voulais " + quantiteSouhaitee + " j'en ai acheté " + quantiteAcheteeTotal);
			}

			@Override
			public String toString() {
				StringBuilder retour = new StringBuilder();
				for (int i = 0; i < nbEtals; i++) {
					retour.append(etals[i].etatEtal());
				}
				return retour.toString();
			}
		};
		// fin

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		village.acheterProduit("sanglier", 3);

		System.out.println(village);
	}

}