package TP1;
public class Produit<T> {
    private String nom;
    private String reference;
    private double prix;
    public Produit(String nom, String reference, double prix) {
        this.nom = nom;
        this.reference = reference;
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", reference='" + reference + '\'' +
                ", prix=" + prix +
                '}';
    }
}