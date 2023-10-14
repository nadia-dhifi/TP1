package TP1;

public class main1 {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
		Fournisseur<Produit> fournisseur1 = new Fournisseur<>("Fournisseur 1", 1);
        @SuppressWarnings("rawtypes")
		Fournisseur<Produit> fournisseur2 = new Fournisseur<>("Fournisseur 2", 2);
        @SuppressWarnings("rawtypes")
		Produit produit1 = new Produit("Produit 1", "P1", 10.0);
        @SuppressWarnings("rawtypes")
		Produit produit2 = new Produit("Produit 2", "P2", 20.0);
        @SuppressWarnings("rawtypes")
		Produit produit3 = new Produit("Produit 3", "P3", 30.0);
        fournisseur1.ajouterProduit(produit1);
        fournisseur1.ajouterProduit(produit2);
        fournisseur2.ajouterProduit(produit3);
        fournisseur1.afficherProduits();
        fournisseur2.afficherProduits();
    }
}