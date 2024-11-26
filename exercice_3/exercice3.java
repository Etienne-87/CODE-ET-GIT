public class StockManager {

    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        if(typeOperation != retrait || typeOperation != ajout){
            System.out.println("Opération inconnue.");
                return;
            }
            else if (typeOperation.equals("ajout"){
                ajoutStock(produit, quantite, stock);
                System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
            }
            else if (typeOperation.equals("retrait"){
                retraitStock(produit, quantite, stock);
            }
        }
    /**
     * Ajout ou retrait de stock
     * 
     * @param produit
     * @param quantite
     * @param stock
     */
    private void ajoutStock(String produit, int quantite, int stock) {
        stock += quantite;
    }

    /**
     * Retrait de stock
     * 
     * @param produit
     * @param quantite
     * @param stock
     */
    retraitStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
        System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
    
}
