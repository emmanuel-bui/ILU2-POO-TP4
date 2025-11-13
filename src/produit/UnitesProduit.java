package produit;

public enum UnitesProduit {
	G("G"), KG("KG"), L("L"), CL("CL"), ML("ML"), PIECE("PIECE");

	private String unite;

	private UnitesProduit(String jsp) {
		this.unite = jsp;
	}
}
