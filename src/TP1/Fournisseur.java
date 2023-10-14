package TP1;
import java.util.ArrayList;
import java.util.List;
public class Fournisseur<T> {
    @SuppressWarnings("unused")
	private String nom;
    @SuppressWarnings("unused")
	private int id;
    private List<T> produits;
    public Fournisseur(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.produits = new ArrayList<>();
    }
    public void ajouterProduit(T produit) {
        produits.add(produit);
    }
    public void afficherProduits() {
        for (T produit : produits) {
            System.out.println(produit);
        }
    }

    }
