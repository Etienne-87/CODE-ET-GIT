public class FactureManager {
    
    /**
     * Calcul le total d'une facture
     * @param typeProduit le type de produit (Alimentaire, Electronique, Luxe)
     * @param quantite la quantité de produit
     * @param prixUnitaire le prix unitaire du produit
     * @return le total de la facture
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        
        double total = quantite * prixUnitaire;
        total -= total * getReduc(typeProduit);
        total = ReducTotal(total);

        return total;
    } 

    /**
     * Retourne le montant de la réduction en fonction du type de produit
     * @param typeProduit le type de produit (Alimentaire, Electronique, Luxe)
     * @return le montant de la réduction
     */
    private double getReduc(String typeProduit){
        if (typeProduit.equals("Alimentaire")) {
            return 0.05;
        } else if (typeProduit.equals("Electronique")) {
            return 0.10; 
        } else if (typeProduit.equals("Luxe")) {
            return 0.20;
        } else {
            return 0;
        }
    }

    /**
     * Applique une réduction sur le total en fonction du montant total
     * @param total le total de la facture
     * @return le total après réduction
     */
    private double reducTotal(double total){
        if (total > 1000) {
            total -= total * 0.05;
        }
    return total;
    }

}

