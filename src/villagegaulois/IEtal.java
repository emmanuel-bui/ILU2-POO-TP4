package villagegaulois;

import personnages.Gaulois;

public interface IEtal<P> {
	Gaulois getVendeur();

	int contientProduit(String produit, int quantiteSouhaitee);

	int acheterProduit(int quantiteSouhaitee);

	String etatEtal();

	void installerVendeur(Gaulois vendeur, P[] produit, int prix);
}
