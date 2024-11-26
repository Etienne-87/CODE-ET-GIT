public class GestionnaireNotes {

    /**
     * Affiche les notes et la moyenne d'un étudiant
     * 
     * @param nomEtudiant nom de l'étudiant
     * @param notes tableau des notes
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {

        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
        double moyenne = calculMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }
    
    /**
     * Calcul de la moyenne des notes
     * 
     * @param notes tableau des notes
     * @return la moyenne des notes
     */
    private double calculMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        double moyenne = (double) somme / notes.length;
        return moyenne;
    }
   
}
